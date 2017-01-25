// Divide 2 numbers without divison.
/*
 * 
 * 17 * 35
 * (16 + 1) (32 + 3)
 * 16 * 32 + 16 * 3 + 32 * 1 + 1 * 3 
 * 
 * 16 * 2^5 + 3 * 2^4 + 1 * 2^5 + 3
 * 
 * hash map {0 -> 1, 1 -> 2 , 2 -> 4, 3 -> 8, 4 -> 16, 5 -> 32 ....100 -> ?}
 * For each number passed 'x'.
 *    iterate hashmap keyset, verify if x < value.
 *    if x < value then
 *       get the previous key and the value.
 *       calculte the diff between the previous key & value.
 *       
 *    do the above for y passed as well.
 *    From multiplication rule (a+b)()
 *    
 *    Multiplying by anything to the power 2 is left shifting by the power in our case the key.
 */
public class BitwiseDivison {

}
