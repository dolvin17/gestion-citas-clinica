# Sistema de Gestión Clínica (UML to Java)

Este repositorio contiene el desarrollo integral de un sistema de gestión de citas médicas. El proyecto se centra en la **integridad del modelo** y la transición coherente entre el diseño visual y la implementación técnica.

---

## Estructura del Proyecto

### [analisis/](./analisis)
Constituye la base funcional del sistema. Aquí se definen los límites del software y cómo interactúan los usuarios con él.
* **Contenido:** Diagrama de Casos de Uso y definición de actores.
* **Enfoque:** Uso de relaciones de herencia entre actores y dependencias `<<include>>` / `<<extend>>` para automatizar procesos críticos como notificaciones y generación de informes.

### [diseno_diagramas/](./diseno_diagramas)
Detalla la arquitectura técnica y el comportamiento dinámico. Este apartado garantiza que el sistema sea un flujo lógico de procesos.
* **Contenido:** Diagramas de Clases (Modelo de Dominio), Secuencia, Actividad y Estados.
* **Enfoque:** Rigor técnico en multiplicidades y trazabilidad total del ciclo de vida del objeto **Cita** (Pendiente -> Realizada/Cancelada).

### [src/](./src)
Implementación directa del diseño en lenguaje **Java**. Estas clases han sido generadas mediante la herramienta Visual Paradigm (herramienta CASE), asegurando una paridad total entre los diagramas y el código fuente.
* **Contenido:** Código fuente de las entidades (`Paciente.java`, `Medico.java`, `Cita.java`, `Informe.java`, `Administrador.java`).
* **Enfoque:** Aplicación de principios de programación orientada a objetos: encapsulamiento, tipado fuerte y métodos de negocio.

### [docs/](./docs)
Documentación técnica que justifica cada decisión arquitectónica tomada durante el desarrollo.
* **Contenido:** Memoria técnica final en formato PDF.
* **Enfoque:** Reflexión sobre la importancia de la coherencia en el modelado y la justificación del desarrollo individual.

---

##  Metodología de Trabajo
A diferencia de un modelado tradicional, este proyecto se ha construido bajo la premisa de que **el comportamiento debe seguir a la estructura**. Los diagramas de secuencia y estados no se adaptaron para "encajar", derivaron estrictamente de los métodos y atributos definidos en el modelo de clases, garantizando un software robusto y funcional.

---
