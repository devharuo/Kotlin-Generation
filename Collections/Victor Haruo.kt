fun main(){

    for(i in 1..100){
        if( i % 3 == 0 && i % 5 == 0){
            print("Victor Harup ")
        } else if(i % 5 == 0){
            print("Victor ")
        } else if( i % 3 == 0){
            print("Haruo ")
        } else{
            print("$i ")
        }
    }
}
