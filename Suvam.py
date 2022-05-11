
str = input()
c1 = 0
c2 = 0
c3 = 0
b1 = 0
b2 = 0
b3 = 0
for ch in str:
    if ch == '(':
        c1 = c1+1
    if ch == '{':
        c2 = c2+1
    if ch == '[':
        c3 = c3+1
    if ch == ')':
        b1 = b1+1
    if ch == '}':
        b2 = b2+1
    if ch == ']':
        b3 = b3+1
a1 = 0
if c1 > 0 and b1 > 0:
    a1 = min(c1, b1)
a2 = 0
if c2 > 0 and b2 > 0:
    a2 = min(c2, b2)
a3 = 0
if c3 > 0 and b3 > 0:
    a3 = min(c3, b3)
if a1 == 0 and a2 == 0 and a3 == 0:
    print("false")
else:
    print("L%dD%dT%d" % (a3, a2, a1))
