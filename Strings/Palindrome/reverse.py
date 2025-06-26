s = "racecar"

def palindrome(s):
    rev = "" #Initialise empty string
    for ch in s: #Iterating through every character in the String
        rev = ch+rev #Appending the character to the empty String
    
    if(rev == s):
        print("True")
    else:
        print("False")

palindrome(s)