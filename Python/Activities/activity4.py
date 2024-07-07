countP1=0
countP2=0
player1=input("Please enter player1 name: ")
player2=input("Please enter player2 name: ")
move1=input(player1 + " choose your 1st move from scessor, rock, paper: ").lower()
move2=input(player2 + " choose your 1st move from scessor, rock, paper: ").lower()
if (move1=='paper' and move2== 'rock')or(move1=='rock' and move2=='scissor')or(move1=='scissor' and move2=='paper'):
    countP1+=1
    print(player1, "Won")
    
elif(move2=='paper' and move1== 'rock')or(move2=='rock' and move1=='scissor')or(move2=='scissor' and move1=='paper'):
    countP2+=1
    print(player2, "Won")
    
else:
    print("Draw")

while True:
    round = input("Do you want to play another round? ").lower()
    if(round=='yes'):
        move1=input(player1 + " choose your 1st move from scessor, rock, paper: ").lower()
        move2=input(player2 + " choose your 1st move from scessor, rock, paper: ").lower()
        if (move1=='paper' and move2== 'rock')or(move1=='rock' and move2=='scissor')or(move1=='scissor' and move2=='paper'):
            countP1+=1
            print(player1, "Won")
        elif(move1=='paper' and move2== 'rock')or(move2=='rock' and move1=='scissor')or(move2=='scissor' and move1=='paper'):
            countP2+=1
            print(player2, "Won")
        else:
            print("Draw")
        continue
    elif(round=='no'):
        print("Final score for: " + player1 +" "+ str(countP1))
        print("Final score for: " + player2 +" "+ str(countP2))
        print("See you again!!!")
        break
    else:
        print("Invalid input")