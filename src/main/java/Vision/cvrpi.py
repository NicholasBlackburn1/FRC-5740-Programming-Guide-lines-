####################################################

## Test Vision System for Robot's Coprocessor  ###

# By Nicholas Blackburn

# TODO:Fix Calc Distace Algorithm

####################################################


import cv2
import urllib
import numpy as np
import math
import ntcore


from networktables import NetworkTables

# Inits Netowktables and connects to robo Rio server

NetworkTables.initialize(server='roboRIO-5740-FRC.local')

# Sets Networktables Sub-Table to Shuffleboard Data tab
visionTable = NetworkTables.getTable("Shuffleboard/DATA")

# Sets a boolean true for an entry on Shuffleboard showing us that robot vision system is enabled
visionTable.putBoolean("Vision System Status", True)

# creates object cap and Opens The RoboRio Video Stream
cap = cv2.VideoCapture()

cap.open('http://roboRIO-5740-FRC.local:1181/?action=stream')

centers = []


while (1):

    # Take each frame
    cap.set(3, 12)
    _, frame = cap.read()

    # First convirts BGR 2 Gray then Converts BGR 2 HSV
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

    # Blurs and Threshholds the camera feed to find
    blur = cv2.GaussianBlur(gray, (5, 5), 0)
    ret, thresh_img = cv2.threshold(blur, 135, 120, cv2.THRESH_BINARY)

    # finds Refelective tape and marks the outside of tape with red lines
    contours = cv2.findContours(
        thresh_img, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)[-2]

    for crt in contours:

        # grabs contour area
        area = cv2.contourArea(crt)

        # Draws contours on the Main video feed
        cv2.drawContours(frame, [crt], -1, (0, 0, 255), 3)

        # Calcs X,Y an the With and Hight of Tape
        x, y, w, h = cv2.boundingRect(crt)

        # calcs rectangle area
        rect_area = w * h

        # calcs rectangle prosessing extend
        extent = float(area) / rect_area

        # need to fix the distance algo
       # distance = 43 * 480 / (crt * math.tan(-34.3))

        visionTable.putNumber("Vision Accuracy", rect_area)

   # cx = int(mid['m10']/perimeter)
   # cy = int(mid['m01']/perimeter)
       # print(distance/12)

    # define range of color in HSVccolorsolors
    lower_blue = np.array([0, 0, 149])
    upper_blue = np.array([150, 150, 300])

    # Threshold the HSV image to get only blue colors
    mask = cv2.inRange(hsv, lower_blue, upper_blue)
    # Threshold the HSV image to get only blue colors
    mask = cv2.inRange(hsv, lower_blue, upper_blue)
    # Bitwise-AND mask and original image
    res = cv2.bitwise_and(frame, frame, mask=mask)

    #  cv2.imshow('contor',contor)
    #cv2.imshow('frame', gray)
    # cv2.imshow('mask', mask)
    #cv2.imshow('res', res)
    #cv2.imshow('blur', blur)

    k = cv2.waitKey(10) & 0xFF
    if k == 27:

        break
cap.release()

cv2.destroyAllWindows()
