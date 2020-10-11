# WhackAMole_Game
This game allows the player to attempts and whack the moles on a grid. The game stops if the player finds all the moles, if they run out of attempts, or if the player enter coordinates (-1,-1) to voluntarily exit the game. After each whack, the player gets to see their progress as the grid is printed out, only revealing mole locations that the player has successfully whacked. After the game is over, the player will get to see what locations they whacked correctly and the remaining moles.
## WhackAMole():
This is the constructor of the class. It takes in the number of attempts allowed for the player and the dimensions of the grid.

## place():
This is a boolean function whih traverses the grid and returns true if a given location has a mole.
## whack():
This function is called each time a user wants to guess amd whack a mole. It places a 'W' on the location if the player whacked a mole, and places an asterix if the location had no mole.
## printGridToUSer():
This function prints the user progress without revealing the location of the remaining moles. It prints a W if a correct location has been whacked, and it prints an asterix for all the remaining coordinates.
## printGrid():
This function prints out the grid showing where the user whacked the moles, where the remaining moles are, and the coordinates with no moles.

