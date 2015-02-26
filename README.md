# Maximum yield

You are a Science Engineer on the Federation mining freighter Daedalus. Your team mines strips for a special type of dilithium that is rare and particularly volatile. This has certain implications.  When your team mines a square in the strip, the trace amounts of dilithium that remain become charged for years. Your team simply cannot mine two squares that are side by side or this would result in an explosion and destroy the planet.  The ship’s sensors can detect the quantity of dilithium in each square in advance. Your team needs to know the optimal squares it should mine, as well as the total yield from a strip of any size so they can bring it before the captain for final approval. 
## Two strip examples:
[ 206, 140, 300, 52, 107 ] should return 613 units, as mining the first, third, and fifth squares is optimal [ 206, x, 300, x, 107 ]

[ 147, 206, 52, 240, 300 ] should return 506 units, as mining the second and fifth squares is optimal [ x, 206, x, x, 300 ]
