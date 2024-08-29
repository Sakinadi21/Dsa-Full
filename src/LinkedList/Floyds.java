package LinkedList;

public class Floyds {
   /*
                             -------k---------
                                 ---------    |
                                /          \  |
    <----------- m ----------->/  length=n  \ |
    ___________________________|            | |
                                \          /  V
                                 ---------

      Distance travelled by fast pointer
      Df = m + n x cf + k

      Distance travelled by slow pointer
      Ds = m + n x cs + k

      Distance travelled by fast pointer will be twice the distance travelled by slow pointer
             Df = 2x Ds
             m + n x cf + k = 2 x (m + n x cs +k)
             m + n x cf + k = 2m + 2ncs + 2k
             ncf - 2ncs = m + k
             n( cf - 2cs ) = m + k
             n(cf -2cs) - (n-r) = m
             n(cf - 2cs) - n + r = m
             n(cf - 2cs -1) + r = m


    */









}
