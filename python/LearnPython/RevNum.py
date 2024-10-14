def reverse(x: int) -> int:
        neg = False

        
        if x < 0:
            neg = True
            x *= -1  

        ans = 0

        
        while x > 0:
            ans *= 10
            ans += x % 10
            x //= 10

        
        if neg:
            ans *= -1

        if ans < -2**31 or ans > 2**31 - 1:
            return 0

        return ans

print(reverse(-123))