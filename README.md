# Tapple
Juego estilo Wordle de platos españoles


# Instalación

# Endpoints
  - startGame (session)
    -> Recibe los datos de sesión del usuario y comprueba si ya ha jugado hoy.
    return hasPlayed, wordLength

  - checkWord (session, word)
	  -> Recibe nuestra palabra y la comprueba con la solución
    return tips[0,1,2]  0 = incorrecto, 1 = correcto, 2 = posición incorrecta
    return successWord

# Modelo de datos

-Colección de platos (MongoDB)
  - id { 
      name: "String",
      lastUsed: Date
      }
      
- Base de datos (SQL)
  - sessions
      id
      todayTries
      lastPlayed
      score??
      
      
  
    
    
    
