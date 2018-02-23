Metricweight=float(input('Please enter the weight in kilos '))
Stones= int(Metricweight//6.3503)
Leftover=(Metricweight%6.3503)
closestpound=float(Leftover%0.453592)
if .226796<closestpound:
    Poundweight=int((Leftover//.453592)+1)
else :
    Poundweight=int(Leftover//.453592)
print ("The weight is ",Stones," Stones and ",Poundweight, " Pounds")


    
