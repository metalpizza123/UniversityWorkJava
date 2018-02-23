word = list(str(input("Please enter a word")))
question = input("Do you want your word encrypt or decrypt?")
shift = int(input("Please enter your shift for your word"))

def caesar_encrypt(abc, d):
    for i in range (len(abc)):
        if abc[i]==(" "):
            abc[i] = abc[i]
        else:
            new = ord(abc[i])+d
            if new>122:
                new=new-26
                abc[i] = chr(new)
            else:
                abc[i] = chr(new)
    abc=''.join(abc)
    print (abc)

def caesar_decrypt(abc, d):
    for i in range(len(abc)):
        if abc[i] == (" "):
            abc[i] = abc[i]
        else:
            new = ord(abc[i]) - d
            if new > 122:
                new = new + 26
                abc[i] = chr(new)
            else:
                abc[i] = chr(new)
    abc = ''.join(abc)
    print(abc)

if question== "encrypt":
    caesar_encrypt(word,shift)
else:
    caesar_decrypt(word, shift)