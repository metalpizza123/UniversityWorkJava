workedhours=float(input('Please enter the number of hours worked this week'))
print ('the normal hourly rate is $10')
overtimehours=workedhours-40
if overtimehours>0:
    normalpay=400
    overtimepay=overtimehours*15
    print ('you were payed $400 for your normal work hours and $', overtimepay, ' for your overtime')
else:
    peasantwages=workedhours*10
    print ('you were payed $',peasantwages,' for your work this week. no overtime pay')
