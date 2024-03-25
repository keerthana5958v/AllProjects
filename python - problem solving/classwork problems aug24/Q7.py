# Consider you have a string that is of length multiple of 3. Divide the string into parts 
# of 3 and check unique characters In each substring and print them

str = "versgeacxfwx"
index = [x for x in range(0,len(str),3)]
each_part = [str[:i] for i in index]
