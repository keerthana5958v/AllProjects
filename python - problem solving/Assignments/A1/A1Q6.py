# Consider you get the radius of a circle as input. Calculate the area and circumference of the circle

import math as m

r=float(input("enter radius"))
ar=m.pi * r * r
print("Area --> ", ar)

cir=m.pi*2*r
print("Circumference -->",cir)