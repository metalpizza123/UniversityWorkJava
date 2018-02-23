sampleText = ("As Python's creator, I'd like to say a few words about its "+
              "origins, adding a bit of personal philosophy.\n"+
              "Over six years ago, in December 1989, I was looking for a "+
              "'hobby' programming project that would keep me occupied "+
              "during the week around Christmas. My office "+
              "(a government-run research lab in Amsterdam) would be closed, "+
              "but I had a home computer, and not much else on my hands. "+
              "I decided to write an interpreter for the new scripting "+
              "language I had been thinking about lately: a descendant of ABC "+
              "that would appeal to Unix/C hackers. I chose Python as a "+
              "working title for the project, being in a slightly irreverent "+
              "mood (and a big fan of Monty Python's Flying Circus).")

#######################################################
##
##               CODE for QUESTION 1 
##
#######################################################

def splitText(text):
    result = []
    wordUnderConstruction = ''

    for char in text:
        
        if char.isalpha(): # continue to build the word
            wordUnderConstruction = wordUnderConstruction + char
            
        else: #probably end of a word as not an alpabet charater
            if wordUnderConstruction != '': #we are at the end of a word
                result.append(wordUnderConstruction)
                wordUnderConstruction = ''  # reinitialise to empty string
                                            # to start new word
            else:
                pass    # do nothing, probably met several non alphabet characters
                        # in row



    if wordUnderConstruction != '': # be careful of not ommitting the last word in
                                    # case the text does not finish with a punctuation
        result.append(wordUnderConstruction)
        wordUnderConstruction = ''

    return result

print ('\n\n Question 1:', splitText(sampleText))
    


#######################################################
##
##               CODE for QUESTION 2 
##
#######################################################

def getWordsStartingWith(text, letter):
    letter = letter.lower()

    words = splitText(text)
    result = []
    for word in words:
        if word.lower().startswith(letter):
            result.append(word)

    return result

print ('\n\n Question 2:', getWordsStartingWith(sampleText, 'a'))


#######################################################
##
##               CODE for QUESTION 3 
##
#######################################################


def getWordsStartingWith(text, letter):
    letter = letter.lower()

    words = splitText(text)
    result = []
    for word in words:
        if (word.lower().startswith(letter)
            and word not in result): # check if word already in the final list
            result.append(word)

    return result

print('\n\n Question 3:', getWordsStartingWith(sampleText, 'a'))
    


#######################################################
##
##               CODE for QUESTION 4 
##
#######################################################


def getWordsFrequencies(text):
    lower = text.lower()
    
    words = splitText(lower)
    frequencies = {}    # Dictionary where the key are the words (str),
                        # the value their number of occurrences (int).
    for word in words:
        if(word in frequencies): #e.g. already occurred once in the text
            occurrences = frequencies[word] # retrieve the number of times
                                            # we already encountered the word
            occurrences += 1
            frequencies[word] = occurrences
        else: # first time we encounter the word so initilise its occurrence to 1
            frequencies[word] = 1

    return frequencies


print ('\n\n Question 4:', getWordsFrequencies(sampleText))




#######################################################
##
##  Problem I
##
#######################################################

## HINTS

## I would use a dictionary to store the data, using a word as a key, and its current number
## of occurences as a value.
##
## You should read one line at a time, transform it into lower case, then split it into a list
## of words (using the split(...) function from a string). For each word in the least, I would
## remove all non alpha-numeric values (you may have to write a function for that).
##
## Then for each word in the list, I would update its current entry in the dictionary if it
## already exist, or add it to the dictionary.
##
## Do that for all line in the file.
##
## For the statistics, I would write one function for each, taking the dictionary as parameter
## and returning the corresponding statistic.


    
#######################################################
##
##  Problem II
##
#######################################################

## HINTS

## Once again I would use a dictionary. I'll add a keyword 'dimension' with a tuple containing its
## dimension as a value (in our case (6,6)).
## example:
##   s = {}
##   s['dimension'] = (6,6)
##
## For each non-zero entries, I would use a tuple(not a list) (row, col) as a key and the entry value
## as value.
## example:
##   s[(1,3)] = 2.0
##   s[(2,2)] = 1.0
##   s[(2,4)] = 1.0
##   ...

## Addition A = M + S: if a key is in matrices S and M, add the two values for that key and store
## the new value into A. For all other keys, add them directly into A with their current value

## Transpose T = transpose(S): for all keys (r,c) with value v in S, add key (c,r) with value v in T


