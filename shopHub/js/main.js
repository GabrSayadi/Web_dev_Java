const programming = document.querySelector(".programming-lang");
const foods = document.querySelector(".foods");
const books = document.querySelector(".books");
const productContainer = document.querySelector(".product-container");
const signUp = document.getElementById("sign-up-btu");

const productCount = 9;
const pricies = [12, 32, 90, 23, 10, 12, 50, 5, 9];

const showProduct = (e) => {
  if (e === "programming-lang") {
    programming.onclick = () => {
      for (let i = 1; i < productCount; i++) {
        productContainer.innerHTML = `
                <div class="product-box f-class sp-bet">
                    <img class="pro-img" src="../img/programming/programming_${i}.svg" alt="png1">
                    <span>Name</span>
                    <span>Type <span class="type">programming</span></span>
                    <span class="main-price">price <span class="price">$${pricies[i]}</span></span>
                    <button type="button" class="btu-st f-w poit">Buy</button>
                </div>
                    `;
      }
    };
  } else if (e === "foods") {
    foods.onclick = () => {
      for (let i = 1; i < productCount; i++) {
        productContainer.innerHTML = `
                    <div class="product-box f-class sp-bet">
                      <img class="pro-img" src="../img/foods/foods_${i}.svg" alt="png${i}">
                      <span>Name</span>
                      <span>Type <span class="type">${e}</span></span>
                      <span class="main-price">price <span class="price">$${pricies[i]}</span></span>
                      <button type="button" class="btu-st f-w poit">Buy</button>
                    </div>
                    `;
      }
    };
  } else {
    books.onclick = () => {
      for (let i = 1; i < productCount; i++) {
        productContainer.innerHTML = `
                <div class="product-box f-class sp-bet">
                    <img class="pro-img" src="../img/books/books_${i}.svg" alt="png${i}">
                    <span>Name</span>
                    <span>Type <span class="type">${e}</span></span>
                    <span class="main-price">price <span class="price">$${pricies[i]}</span></span>
                    <button type="button" class="btu-st f-w poit">Buy</button>
                </div>
                    `;
      }
    };
  }
};

const signUpfun = () => {
  signUp.onclick = location.href = "/Project_1/html/signUp.html";
};
