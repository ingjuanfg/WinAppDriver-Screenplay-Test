# WebAppDriver Test Screenplay

[![N|Solid](https://static.wixstatic.com/media/4d0822_8397ae7872d54afe82e6b41290931fd4~mv2.png/v1/fill/w_208,h_68,al_c,q_80,usm_0.66_1.00_0.01/4d0822_8397ae7872d54afe82e6b41290931fd4~mv2.webp)](https://nodesource.com/products/nsolid)


Automatización de escritorio con la Calculadora de Windows utilizando Screenplay como framework.

## Requisitos:
- Descargar *(preferiblemente una versión estable)* WinAppDriver : [WinAppDriver Releases](https://github.com/Microsoft/WinAppDriver/releases "WinAppDriver Releases") Descargar archivo **WindowsApplicationDriver.msi** e instalar, se recomienda dejar la ruta por defecto.
- Activar modo Desarrollador en Windows -> Configuración -> Buscar "Configuración del Desarrollador" ->** Activar el Check de Modo Programador"**
- Descargar el instalador del SDK Windows 10: [Descargar SDK Windows 10](https://developer.microsoft.com/es-es/windows/downloads/windows-10-sdk "Descargar SDK Windows 10")  No descargar el ISO. Una vez descargado el instalador realizar la instalación, se recomienda dejar la ruta de instalación por defecto.
**Nota:** Esta herramienta nos brinda el Inspector para poder mapear los objetos de la aplicación de escritorio que queremos trabajar.

### Despues de Instalar
- Vamos a la ruta donde se instalo el WinAppDriver y ejecutamos *WinAppDriver.exe* por defecto la ruta deberia de ser: `C:\Program Files (x86)\Windows Application Driver`

Deberia de abrir una consola con el siguiente mensaje:
[![winappdriver](https://i.ibb.co/jygmBZ5/Captura.png "winappdriver")](https://i.ibb.co/jygmBZ5/Captura.png "winappdriver")

- Una vez se haya ejecutado se puede ejecutar la automatización

### Mapeo de Objetos
- Si se quiere mapear alguna aplicación en especifico dirigirse a la ruta `C:\Program Files (x86)\Windows Kits\10\bin\10.0.18362.0\x64` (ruta de instalación del SDK de windows 10) y ejecutar en **inspect.exe**.

### Comando ejecución
- `gradle clean test aggregate`

### Resultado de la ejecución

[![Reporte](https://i.ibb.co/RNGLvf4/Captura1.png "Reporte")](https://i.ibb.co/RNGLvf4/Captura1.png "Reporte")


Se crearán escenarios mas complejos que tengan un flujo mayor y con aplicaciones distintas.

