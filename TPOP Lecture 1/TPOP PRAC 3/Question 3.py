original=list(str(input("Enter the stuff you want to encrypt or decrypt")))
choice=str(input("Do you want to encrypt or decrypt? (E/D)"))
order=int(input("How many spaces forward is it?"))
def encrypt(cipherinfo,spaces):
    for x in range (0,len(cipherinfo)):
        if cipherinfo[x]==" ":
            cipherinfo[x]=cipherinfo[x]
        else:
            encryptval=ord(cipherinfo[x])+spaces
            if encryptval>122:
                encryptval=encryptval-26
            cipherinfo[x]=chr(encryptval)
    cipherinfo=''.join(cipherinfo)
    print (cipherinfo)
def decrypt(cipherinfo,spaces):
    for x in range (0,len(cipherinfo)):
        if cipherinfo[x]==" ":
            cipherinfo[x]=cipherinfo[x]
        else:
            encryptval=ord(cipherinfo[x])-spaces
            if encryptval<97:
                encryptval=encryptval+26
            cipherinfo[x]=chr(encryptval)
    cipherinfo = ''.join(cipherinfo)
    print(cipherinfo)
if choice=="E":
    encrypt(original,order)
elif choice=="D":
    decrypt(original,order)