# 🛒 SAPAMERCAT - Gestió de Carret de Compra

## 📌 Descripció del Projecte
Aquest projecte implementa un sistema de gestió de productes en un supermercat.  
L'usuari pot:
- Afegir productes al carret de compra.
- Consultar el contingut del carret.
- Passar per caixa per finalitzar la compra.

## 📂 Estructura del Codi
### 🔹 Model:
- **`Producte`**: Classe abstracta base per a tots els productes.
- **`Alimentacio`**, **`Textil`**, **`Electronica`**: Subclasses amb funcionalitat específica.
- **`CarretCompra`**: Gestiona els productes afegits al carret.

### 🔹 Vista:
- **`Vista`**: Mostra els menús i informació a l'usuari.

### 🔹 Controlador:
- **`Controlador`**: Gestiona la interacció entre l’usuari i el model.

## 🎯 Decisions de Disseny
1. **Estructura de Productes**  
   - `Producte` és abstracte per forçar la implementació específica a `Alimentacio`, `Textil` i `Electronica`.
   - Cada tipus de producte té la seva pròpia lògica per calcular el preu.

2. **Gestió del Carret**  
   - **ArrayList** per gestionar productes de manera flexible.
   - **HashMap** per ordenar els productes pel seu codi de barres i quantitat.

3. **Fluïdesa del Programa**  
   - Menús interactius mitjançant `Vista`.
   - Validació d'entrades (per exemple, dates de caducitat).

## 🚀 Funcionament
1. L’usuari pot afegir productes al carret segons la seva categoria.
2. Pot consultar els productes afegits en qualsevol moment.
3. Finalment, pot processar la compra passant per caixa.

---
