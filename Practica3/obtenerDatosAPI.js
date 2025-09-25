
function obtenerDatos() {
  return new Promise((resolve) => {
    console.log("Consultando API...");


    setTimeout(() => {
      resolve({ id: 124051, nombre: "Alejandro Ochoa Valencia", rol: "usuario" });
    }, 5000);
  });
}

async function main() {
  try {
    const datos = await obtenerDatos();
    console.log("Datos recibidos:", datos);
  } catch (error) {
    console.error("Error al obtener datos:", error);
  }
}

main();
