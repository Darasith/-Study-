while True:
    a = input("Enter a number\n")
    try:
        a = int(a)
        if (a%2==0):
            print(a,"is EVEN")
        elif(a%2!=0):
            print(a,"is ODD")
    except:
        if a.isdigit()==False or a!="EXIT":
            print(a,"is not a valid number")
        if a == "EXIT":
            break
            
            
        
    
