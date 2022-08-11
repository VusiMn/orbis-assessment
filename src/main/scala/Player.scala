class Player(val name: String) {
   var score = 0 // random generater game score
   var gamesWon = 0 // keep track of the games he wins in a set
   var setsWon = 0 //keep track of sets he wins

  def resetGamesWon(): Unit = gamesWon = 0

}
