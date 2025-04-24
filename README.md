# PracticaPatronesAYD2

## Diagrama
[![](https://img.plantuml.biz/plantuml/svg/lLRBZXCn4BpdAwoS9gnou3f2gyq6a82LM2avS7Ni9bZhn-37AX7mKNm3FuOVCudjcI042xcCrLrTNMsNhTmOYxLrWiywJ1xm7j1SWuyvZQM5-PSPyZ_2iJ7elQOWKOg4tnBTSspLzjW1wi8gowmeZN5CbEZmZ-zOC905uXPsZE88siLbbhjZnhvuTR0wvgyHXAKv0QxG7cpitIpQiuWiRuPyr9LX5YL94X5Opd9AcXwH9EQmYYcgDO6f4b_IzR0qq0YRSs9AOo9XMtH2LOrNvGu71VtcbvrhN7Kofwf4_sqMFynxG7_41D1BPeXoqcwy2WlxO-Q3AqGm9yvlCGoeHdclw3PPnYkYokquvCp9KgyrV7Q-_TePgmJeeHunqN4GFcF-KUUj0qFnyHvxh_-FhkdogEKIpP_FAy-MkVpqoapbqIpvR7xsHvKR3T8Yt7MSWSctenIKOhcG5Aa4fE2vSVLMw5l7kFyKJqOlBAH_wxws1TKVMlfN99Sl-CMgorVpOiakH9e-ByTsZ6Lh9GIMjB0Q780u2qr-wvsagbcCIJOWwLQzOvPy0ZcGPPv-aYPhB0dmWkh9MwJwD_9HFKpOvyJlmRPVbsVQ1niYQ5kKBCQA1cmjxEvCFgMnt-NDqLWGnQGQ2B17Y6sRW-0jybUFoVs5XxKdMb7SsMBOC8caYQPuNiPYtXebj-g3u0DBTY9_nryTHNXGylsCc4dRBPTVhyVG2VDC0qSJHLWvopGmI2mEP-P7kV4I_N-Sdm00)](https://editor.plantuml.com/uml/lLRBZXCn4BpdAwoS9gnou3f2gyq6a82LM2avS7Ni9bZhn-37AX7mKNm3FuOVCudjcI042xcCrLrTNMsNhTmOYxLrWiywJ1xm7j1SWuyvZQM5-PSPyZ_2iJ7elQOWKOg4tnBTSspLzjW1wi8gowmeZN5CbEZmZ-zOC905uXPsZE88siLbbhjZnhvuTR0wvgyHXAKv0QxG7cpitIpQiuWiRuPyr9LX5YL94X5Opd9AcXwH9EQmYYcgDO6f4b_IzR0qq0YRSs9AOo9XMtH2LOrNvGu71VtcbvrhN7Kofwf4_sqMFynxG7_41D1BPeXoqcwy2WlxO-Q3AqGm9yvlCGoeHdclw3PPnYkYokquvCp9KgyrV7Q-_TePgmJeeHunqN4GFcF-KUUj0qFnyHvxh_-FhkdogEKIpP_FAy-MkVpqoapbqIpvR7xsHvKR3T8Yt7MSWSctenIKOhcG5Aa4fE2vSVLMw5l7kFyKJqOlBAH_wxws1TKVMlfN99Sl-CMgorVpOiakH9e-ByTsZ6Lh9GIMjB0Q780u2qr-wvsagbcCIJOWwLQzOvPy0ZcGPPv-aYPhB0dmWkh9MwJwD_9HFKpOvyJlmRPVbsVQ1niYQ5kKBCQA1cmjxEvCFgMnt-NDqLWGnQGQ2B17Y6sRW-0jybUFoVs5XxKdMb7SsMBOC8caYQPuNiPYtXebj-g3u0DBTY9_nryTHNXGylsCc4dRBPTVhyVG2VDC0qSJHLWvopGmI2mEP-P7kV4I_N-Sdm00)
## Justificación de Diseño y Uso de Patrones de Diseño

### Strategy Pattern

Ya que el sistema debe de permitir aplicar diferentes tipos de descuentos a los pedidos, dependiendo del tipo de cliente o de promociones especiales, pueden agregarse nuevas sin necesidad de modificar la lógica de cálculo del pedido.

**Aplicado en:**

- **FrequentCustomerDiscount**: Descuento para clientes frecuentes.

- **TuesdayPastaDiscount**: Promoción específica los martes para pastas.

___

### Builder Pattern

Los pedidos son personalizables y pueden contener múltiples combinaciones de platos, bebidas, acompañamientos y extras. Además, algunos de estos elementos son obligatorios y otros opcionales.

**Aplicado en:**

- **OrderBuilder**: Facilita la creación flexible de un pedido, permitiendo agregar extras opcionales y asegurando que los componentes obligatorios estén presentes.

___

### Command Pattern

El sistema debe gestionar acciones sobre los pedidos como enviar a cocina, cancelar o incluso deshacer la última acción realizada. Esto implica que las acciones deben ser tratadas como objetos y permitir su ejecución y reversión.

**Aplicado en:**

- **SendToKitchenCommand**: Encapsula la acción de enviar el pedido a cocina.

- **CancelOrderCommand**: Encapsula la acción de cancelar el pedido.

- **CommandInvoker**: Permite ejecutar y deshacer la última acción.

___

### Adapter Pattern

Existe una incompatibilidad entre los formato de datos, sistema de atención al cliente (JSON) y el sistema de cocina (que espera XML), por lo que debe de haber una conversion transparente a nivel de usuario.

**Aplicado en:**
- **JsonToXmlAdapter:** Convierte la información del pedido de JSON a XML y la envía al KitchenSystem.

- **KitchenSystem:** Simula el sistema de cocina que recibe los pedidos en formato XML.