import scala.util.Random

class MatchX {

  val player1 = new Player("Vusi")
  val player2 = new Player("Dalisani")
  val maximumSets = 3


 def determineSetWinner(): Unit = {
    val random = Random// random generate score

   var setWinner = false

   while(setWinner == false) {

     player1.score = random.nextInt(100)
     player2.score = random.nextInt(100)

     if(player1.score > player2.score) {

       println(s" ${player1.name } won set score ${player1.score} - ${player2.score}")
     } else{
       println(s" ${player2.name } won set score ${player2.score} - ${player1.score}")
     }
   }

 }






}
