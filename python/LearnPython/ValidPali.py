def isPalindrome(s: str) -> bool:
    newStr = ""
    for i in range(len(s)):
        if(s[i].isalnum()):
            newStr += s[i].lower()
    
    return newStr == newStr[::-1]

print(isPalindrome("A man, a plan, a canal: Panama"))