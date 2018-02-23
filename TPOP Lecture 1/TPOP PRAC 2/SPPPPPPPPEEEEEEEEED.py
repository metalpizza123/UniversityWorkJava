initiald=float(input('What speed was teh vehicle at? '))
itsdapolice=int(input('What is the speed limit here?'))
if initiald>=90:
    print ('Fine that boi 300 pounds')
elif initiald<=itsdapolice:
    print ("He's/She's/It's/They are below the speed limit.")
else :
    overthelimit=int(initiald-itsdapolice)
    fine=overthelimit*5
    print("Fine the driver $",fine)
