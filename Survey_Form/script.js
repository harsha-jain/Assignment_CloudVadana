document.addEventListener("DOMContentLoaded", function () {
  const form = document.getElementById("survey-form");
  const submitButton = document.getElementById("submit-button");
  const resetButton = document.getElementById("reset-button");
  const popup = document.getElementById("popup");
  const popupContent = document.getElementById("popup-content");
  const closeButton = document.getElementById("close-button");

  form.addEventListener("submit", function (e) {
    e.preventDefault();

    // Validation functions can be added here for each input field if needed
    const firstName = document.getElementById("first-name").value;
    const lastName = document.getElementById("last-name").value;
    // ... (validate and collect other field values as needed)

    // Build the popup content
    popupContent.innerHTML = `
      <p><strong>First Name:</strong> ${firstName}</p>
      <p><strong>Last Name:</strong> ${lastName}</p>
      <!-- ... (add other field values as needed) -->
    `;

    // Display the popup
    popup.style.display = "flex";
  });

  closeButton.addEventListener("click", function () {
    // Close the popup
    popup.style.display = "none";
  });

  resetButton.addEventListener("click", function () {
    // Reset the form
    form.reset();
  });
});
