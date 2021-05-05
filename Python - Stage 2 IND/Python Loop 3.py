# use python3
def main():
    n = int(input())
    if len(str(n)) == 3:
        is_armstrong_number(n)
    else:
        print("INVALID_INPUT")


def is_armstrong_number(num1):
    s = 0
    check = num1
    while num1:
        rem = num1 % 10
        s += rem**3
        num1 //= 10
    if check == s:
        print("ARMSTRONG")
    else:
        print("NOT ARMSTRONG")


main()
