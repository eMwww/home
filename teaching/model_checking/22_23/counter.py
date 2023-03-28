##
#
# Auhor: Emilio Tuosto
#
# A python implementation of Example 1.1 from
# Baier, Katoen: Principles of Model Checking. MIT Press
#
##

from time import sleep
import threading

x = 0
bound = 3
loop = True

def inc():
    global x, loop, bound
    while loop:
        print('inc', x)
        if x < bound:
            x += 1

def dec():
    global x, loop, bound
    while loop:
        print('\tdec', x)
        if x > 0:
            sleep(1)
            x -= 1
            loop = x >= 0

def reset():
    global x, loop, bound
    i = 0
    while loop:
        if x == bound:
            print('\t\treset', i)
            x = 0
            i += 1

i = threading.Thread(target = inc)
d = threading.Thread(target = dec)
r = threading.Thread(target = reset)

i.start()
d.start()
r.start()

i.join()
d.join()
r.join()

print(x, "What???")
