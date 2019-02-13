# ProjectOverlord
Creating chess with Java.

## Features
* Completely playable.
* Enforces legal moves.
* Allows pawn promotions.

## To Do List
* Add in check and check mate features.
* Add en passant
* Add castling

## Known Bugs
* Wrong message sent during an invalid move. This is caused by the following steps:
  * It is your turn.
  * You do an illegal move, like attacking an enemy in a way that you can't move. (Like a pawn attacking horizontally).
  * Message displays "It is not your turn". But the message should be "Invalid move."
