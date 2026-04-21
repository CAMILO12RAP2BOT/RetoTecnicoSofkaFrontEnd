# Reto Técnico Sofka - Open Cart Abstracta

Proyecto de automatización de pruebas de aplicaciones web utilizando **Screenplay Pattern** con **Serenity BDD** y **Selenium**.

## Descripción

Este proyecto automatiza casos de prueba para la aplicación Open Cart Abstracta, incluyendo:
- Realización de compras


## Tecnologías

- **Java** 21+
- **Serenity BDD** 4.3.4 - Framework de testing con reporting avanzado
- **Screenplay Pattern** - Patrón de diseño para pruebas de UI
- **Selenium WebDriver** 4.15.0 - Automatización web
- **JUnit** 4.13.2 - Framework de testing
- **Cucumber** - Pruebas conducidas por comportamiento (BDD)
- **WebDriverManager** 6.3.3 - Gestión automática de drivers
- **Gson** 2.10.1 - Procesamiento de JSON

## Estructura del Proyecto

```
RetoTecnicoChoucair/
├── src/
│   ├── main/java/com/sofka/             # Código fuente principal
│   │   ├── models/                      # Modelos de datos
│   │   ├── questions/                   # Preguntas (Screenplay)
│   │   ├── tasks/                       # Tareas (Screenplay)
│   │   ├── actions/                     # Acciones (Screenplay)
│   │   ├── interactions/                # Interacciones
│   │   └── utils/                       # Utilidades
│   ├── test/java/com/sofka/             # Código de pruebas
│   │   ├── com.sofka.runners/           # Runners de JUnit/Cucumber
│   │   └── com.sofka.stepdefinitions/   # Definiciones de pasos
│   └── test/resources/
│       ├── features/                    # Archivos .feature (Gherkin)
│       └── serenity.properties          # Configuración de Serenity
├── build.gradle                         # Configuración de Gradle
└── README.md                            # Este archivo
└── conclusiones.md                      # Conclusiones del proyecto
```

## Ejecución de Pruebas

### Prerrequisitos

- **Java Development Kit (JDK)** 21 o superior
- **Gradle** (se incluye con el proyecto mediante `gradlew`)

### Ejecutar todas las pruebas

Para ejecutar el suite completo de pruebas, solo debes ejecutar **MasterRunner**:

```bash
./gradlew clean test --tests MasterRunner
```

**En Windows (PowerShell):**
```powershell
.\gradlew.bat clean test --tests MasterRunner aggregate
```

### Detalles de MasterRunner

**MasterRunner** es el punto de entrada principal para todas las pruebas del proyecto. Utiliza `@Suite` de JUnit para ejecutar de manera secuencial los siguientes com.sofka.runners:

1. **CompraRunner** - Pruebas de realización de compra

```java
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ComprarRunner.class
})
public class MasterRunner { }
```

## Reportes

Después de ejecutar las pruebas, los reportes de Serenity se generan automáticamente en:

```
target/site/serenity/index.html
```

Los reportes incluyen:
- Resumen de ejecución
- Detalles de cada escenario
- Capturas de pantalla
- Logs de eventos
- Tiempos de ejecución

## Archivos de Configuración

### serenity.properties
Define la configuración de Serenity BDD:
- Navegador a utilizar
- URLs base
- Opciones de Selenium
- Configuración de reportes

## Patrón Screenplay

El proyecto implementa el patrón Screenplay para pruebas claras y mantenibles:

- **Actors**: Representan usuarios interactuando con la aplicación
- **Tasks**: Acciones de alto nivel que un usuario realiza
- **Questions**: Verificaciones del estado de la aplicación
- **Interactions**: Acciones de bajo nivel con Selenium
- **Abilities**: Capacidades que los actores necesitan (ej: navegar web)

## Contribución

Las modificaciones deben seguir los estándares del proyecto y pasar todas las pruebas antes de ser integradas.

## Soporte

Para reportar problemas o sugerencias, contactar al desarrollador.

---

**Última actualización**: 20 Abril 2026

