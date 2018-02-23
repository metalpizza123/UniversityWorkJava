timearechanging=int(input('What year is it?'))
leftover=timearechanging%4
leftovercenturies=timearechanging%100
leftover400=timearechanging%400
if leftovercenturies==0:
    if leftover400==0:
        print ("It's a leap year")
    else:
        print ("It's not a leap year")
elif  leftover==0:
    print("It's a leapyear")
else:
    print("It's not a leap year")
