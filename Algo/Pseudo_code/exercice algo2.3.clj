VARIABLE
    a est un ENTIER
    b est un ENTIER
    c est un ENTIER
DEBUT DU PROGRAMME
    ecrire "saisir a"
    lire a
    ecrire "saisir b"
    lire b
    ecrire "saisir c"
    lire c
    Si (a <= b et a <= c) 
    alors
      Si(b <= c ) 
      alors
          a <= b <= c
      sinon
          a <= c <= b
    sinon Si (b <= a et b <= c)
          alors
            si (a <= c)
            alors    
                b <= a <= c
            sinon
                b <= c <= a
          sinon Si (c <= a ET c <= b)
                alors
                  Si (a <= b)
                  alors
                      c <= a <= b
                  sinon
                      c <= b <= a