//Zona 1 Imports : Zona de importaciones

import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button } from 'react-native';
import React, {useState} from 'react';


// Zona 2 Main: Zona de componentes
export default function App() { 

  const [contador,setContador]=useState();
  return (
    <View style={styles.container}>
      <Text>Contador: {contador} </Text>
      <Button title="Agregar" onPress={()=>setContador(contador+1)}></Button>
       <Button title="Quitar" onPress={()=>setContador(contador-1)}></Button>
        <Button title="Reiniciar" onPress={()=>setContador(contador-contador)}></Button>          
      <StatusBar style="auto" />
    </View>
  );
}


// Zona 3 Estilos: Zona de estética y posicionamiento
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
