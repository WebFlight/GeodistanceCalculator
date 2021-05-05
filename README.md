# Geodistance calculator
Module to calculate the geodistance between two lat/long points.

## How to use
Configure the constant EARTHRADIUS to contain the radius of the earth in the unit you want your output to be in. If you want your output in meters, configure this constant to 6371000. If you want it to be miles, configure the constant to be 3958,8. Do you want to use another unit for your output? No problem, just google the radius of the earth in your desired unit, configure that as the earth radius and you'll get your output in that format.

Simply add the action to your microflow, configure the parameters and the distance between the two points is returned as a decimal value.
In case one of the five configurable values is empty, an exception is thrown.

## Test project
https://geodistancecalculator-sandbox.mxapps.io
Log in with MxAdmin, password: 1

## Other
No custom .jar files are used for this module.
