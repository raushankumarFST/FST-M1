player1=input("Please enter player1 name: ")
player2=input("Please enter player2 name: ")
move1=input(player1 + " choose your 1st move from scessor, rock, paper: ").lower()
move2=input(player2 + " choose your 1st move from scessor, rock, paper: ").lower()
if (move1=='paper' and move2== 'rock')or(move1=='rock' and move2=='scissor')or(move1=='scissor' and move2=='paper'):
    print(player1, "Won")
    
elif(move2=='paper' and move1== 'rock')or(move2=='rock' and move1=='scissor')or(move2=='scissor' and move1=='paper'):
    print(player2, "Won")
    
else:
    print("Draw")
    

