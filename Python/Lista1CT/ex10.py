distancia = float(input("Informe a distancia (m): "))

tempo = float(input("Informe o tempo (s): "))

velocidade = distancia / tempo

print("Velocidade em m/s", velocidade)

distanciaKm = distancia / 1000
tempoHoras = tempo / 3600

velocidade = distanciaKm / tempoHoras

print("Velocidade em km/h", velocidade)