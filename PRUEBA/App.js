//1.-Imports: Zona de importaciones
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button } from 'react-native';
import ContadorScreen from './Screens/ContadorScreen';
//2.- Main: Zona de componentes
export default function App() {


  return (
    <ContadorScreen></ContadorScreen>

  );
}

//3.- Estilos: Zona de estetica y posicionamiento
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});