/**
 * Project: Raven Watches E-Store
 * File: scripts.js
 * Description: This file contains the JavaScript functionalities for the Raven Watches E-Store,
 *              including hamburger menu toggle and price calculation for the watch selection form.
 * Author: Mohammad Makableh
 * Version: 1.0.0
 * Last Modified: 2024-08-10
 */


document.addEventListener('DOMContentLoaded', function() {

    /**
     * Hamburger Menu Toggle
     * Toggles the display of the navigation menu when the hamburger menu icon is clicked.
     */
    const hamburgerMenu = document.getElementById('hamburger-menu');
    const navMenu = document.getElementById('nav-menu');

    hamburgerMenu.addEventListener('click', function() {
        if (navMenu.style.display === 'flex') {
            navMenu.style.display = 'none';
        } else {
            navMenu.style.display = 'flex';
        }
    });

    /**
     * Price Calculation for Watch Selection Form
     * Calculates and displays the total price of selected watches based on user input.
     * Updates the total price whenever a checkbox is checked or unchecked.
     */
    const checkboxes = document.querySelectorAll('input[type="checkbox"]');
    const totalPriceElement = document.getElementById('totalPrice');
    const totalPriceInput = document.getElementById('totalPriceInput');

    // Add event listeners to all checkboxes
    checkboxes.forEach(checkbox => {
        checkbox.addEventListener('change', calculateTotal);
    });

    /**
     * Calculates the total price of selected watches and updates the DOM.
     */
    function calculateTotal() {
        let total = 0;

        checkboxes.forEach(checkbox => {
            if (checkbox.checked) {
                total += parseInt(checkbox.getAttribute('data-price'), 10);
            }
        });

        // Update the total price in the DOM
        totalPriceElement.textContent = `$${total}`;
        totalPriceInput.value = total;
    }
});
