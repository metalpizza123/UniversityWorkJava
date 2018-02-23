askuser=str(input("Which type of mass measurement do you want to convert? "))
if askuser==("pounds and stones"):
    stones=int(input("Please enter the number of stones  "))
    pounds=float(input("Please enter the number of pounds  "))
    metricweight=(stones*6.3503)
    metricweight=(metricweight +(pounds*0.453592))
    print ("The weight is",metricweight, "kg")
elif askuser==("kilograms"):
    metricweight=float(input('Please enter the weight in kilos '))
    closeststone=float(metricweight%6.3503)
    if closeststone>(.226796):
        stones= int(metricweight//6.3503)
        leftover=(metricweight%6.3503)
        closestpound=float(leftover%0.453592)
        if .226796<closestpound:
            poundweight=int((leftover//.453592)+1)
        else :
            poundweight=int(leftover//.453592)
            print ("The weight is ",stones," Stones and ",poundweight, " Pounds")
    elif closeststone<=(.226796):
        print ("wtf")
        #stones=int((metricweight//6.3503)+1)
        #print ("The weight is ",stones," Stones")
        
    

