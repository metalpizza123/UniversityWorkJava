drone=str(input('Please enter the words'))
nospace=drone.replace(" ", "")
nocapital=nospace.lower()
reverse=nocapital[::-1]
if reverse==nocapital:
    print ("It's a palindrommmmmmmmmme")
else:
    print ("It's not a palindrommmmmmmmmme")
