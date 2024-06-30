<p align="center">
    <h1 align="center">ONLINE-SHOP</h1>
</p>
<p align="center">
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/ftvaziri/online-shop?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/ftvaziri/online-shop?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/ftvaziri/online-shop?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/ftvaziri/online-shop?style=default&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>

<br><!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary><br>

- [ Overview](#-overview)
- [ Features](#-features)
   - [ User Roles](#-user-roles)
   - [ Detailed Features](#-detailed-features)
      - [ User Profile Management](#-user-profile-management)
      - [ Product Management](#-product-management)
      - [ Shopping Cart and Checkout](#-shopping-cart-and-checkout)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Tests](#-tests)
- [ Contributing](#-contributing)

</details>
<hr>

##  Overview

This Java-based e-commerce platform offers a comprehensive shopping experience, including user and admin functionalities. Regular users can browse, search, sort, and purchase products, while admins have the capability to manage the product listings and user profiles.

---

##  Features

### User Roles

- Admin
  - View all users
  - View all products
  - Add new products to the store
  - Edit user profiles
- Regular User
  - View personal profile
  - Edit personal profile
  - Browse products
  - Search for products
  - Sort products by different criteria
  - Add products to the shopping cart
  - View and manage the shopping cart
  - Top up account balance
  - Purchase items in the shopping cart

### Detailed Features

#### User Profile Management

- Admin
  - Access the list of all users
  - Edit any user's profile information
- Regular User
  - View and edit their own profile details such as name, email, and address

#### Product Management

- Admin
  - View the complete list of products
  - Add new products with details such as name, price, description, and stock quantity
- Regular User
  - Browse through available products
  - Search for products by name or category
  - Sort products by price, popularity, or rating
  - Add desired products to their shopping cart

#### Shopping Cart and Checkout

- Regular User
  - Add products to the shopping cart
  - View and modify the shopping cart (remove items, update quantities)
  - Top up their account balance to ensure sufficient funds for purchases
  - Complete the checkout process to purchase items in the cart

---

##  Repository Structure

```sh
└── online-shop/
    ├── README.md
    ├── online-shop.iml
    └── src
        ├── .DS_Store
        ├── Comparator
        ├── Data
        ├── Main.java
        ├── base
        ├── listPanels
        ├── loginSignup
        ├── productDetailsPanels
        ├── productsPanels
        └── profilePanels
```

---

##  Modules

<details closed><summary>src</summary>

| File                                                                           | Summary                         |
| ---                                                                            | ---                             |
| [Main.java](https://github.com/ftvaziri/online-shop/blob/master/src/Main.java) | <code> main class to run the program </code> |

</details>

<details closed><summary>src.loginSignup</summary>

| File                                                                                                     | Summary                         |
| ---                                                                                                      | ---                             |
| [signupPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/loginSignup/signupPanel.java) | <code> the signup panel </code> |
| [loginPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/loginSignup/loginPanel.java)   | <code>the login panel </code> |

</details>

<details closed><summary>src.Comparator</summary>

| File                                                                                                                            | Summary                         |
| ---                                                                                                                             | ---                             |
| [CheapestComparator.java](https://github.com/ftvaziri/online-shop/blob/master/src/Comparator/CheapestComparator.java)           | <code> a class used for sorting products by price (increasing) </code> |
| [MostPopularComparator.java](https://github.com/ftvaziri/online-shop/blob/master/src/Comparator/MostPopularComparator.java)     | <code> a class used for sorting products by popularity </code> |
| [MostExpensiveComparator.java](https://github.com/ftvaziri/online-shop/blob/master/src/Comparator/MostExpensiveComparator.java) | <code> a class used for sorting products by price (decreasing) </code> |

</details>

<details closed><summary>src.profilePanels</summary>

| File                                                                                                                         | Summary                         |
| ---                                                                                                                          | ---                             |
| [profilePanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/profilePanels/profilePanel.java)                 | <code> the parent classed used for profile panels </code> |
| [editProfilePanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/profilePanels/editProfilePanel.java)         | <code> a panel to edit profile </code> |
| [cashIncreasePanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/profilePanels/cashIncreasePanel.java)       | <code> a panel to increase cash on the online wallet</code> |
| [customerProfilePanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/profilePanels/customerProfilePanel.java) | <code> a child class for costumers proflie </code> |
| [sellerProfilePanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/profilePanels/sellerProfilePanel.java)     | <code> a child class for sellers profile </code> |

</details>

<details closed><summary>src.productDetailsPanels</summary>

| File                                                                                                                              | Summary                         |
| ---                                                                                                                               | ---                             |
| [addProductPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/productDetailsPanels/addProductPanel.java)         | <code> a panel to add products to the shop </code> |
| [productDetailsPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/productDetailsPanels/productDetailsPanel.java) | <code> a parent class used to create edit product panel and add product panel </code> |
| [editProductPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/productDetailsPanels/editProductPanel.java)       | <code> a panel to edit the products of the shop </code> |

</details>

<details closed><summary>src.listPanels</summary>

| File                                                                                                                            | Summary                         |
| ---                                                                                                                             | ---                             |
| [customersListPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/customersListPanel.java)           | <code> a panel providing a list of costumers who have purchased from this shop </code> |
| [customerCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/customerCard.java)                       | <code> used to create cards for the costumer list panel </code> |
| [sellerProductListCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/sellerProductListCard.java)     | <code> used to create cards for the tock panel panel </code> |
| [cartPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/cartPanel.java)                             | <code> the cart panel </code> |
| [productListCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/productListCard.java)                 | <code> a parent class used to create cards for the cart panel and stock panel </code> |
| [stockPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/stockPanel.java)                           | <code> a panel for the shop inventory stock </code> |
| [customerProductListCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/listPanels/customerProductListCard.java) | <code> used to create cards for the cart panel </code> |

</details>

<details closed><summary>src.productsPanels</summary>

| File                                                                                                                            | Summary                         |
| ---                                                                                                                             | ---                             |
| [sellerProductCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/productsPanels/sellerProductCard.java)         | <code> product cards for sellers' products panel </code> |
| [costumerProductCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/productsPanels/costumerProductCard.java)     | <code> product cards for costumers' products panel </code> |
| [sellerProductsPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/productsPanels/sellerProductsPanel.java)     | <code> products panel for sellers </code> |
| [productCard.java](https://github.com/ftvaziri/online-shop/blob/master/src/productsPanels/productCard.java)                     | <code> a parent class used to create products card for products panels </code> |
| [productsPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/productsPanels/productsPanel.java)                 | <code> the parent class for different users types' products panels </code> |
| [customerProductsPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/productsPanels/customerProductsPanel.java) | <code> products panel for costumers </code> |

</details>

<details closed><summary>src.Data</summary>

| File                                                                                            | Summary                         |
| ---                                                                                             | ---                             |
| [Product.java](https://github.com/ftvaziri/online-shop/blob/master/src/Data/Product.java)       | <code> a class for products </code> |
| [Customer.java](https://github.com/ftvaziri/online-shop/blob/master/src/Data/Customer.java)     | <code> a child class from "User" class for customers (a user type) </code> |
| [Validation.java](https://github.com/ftvaziri/online-shop/blob/master/src/Data/Validation.java) | <code> a class used for validating inputs</code> |
| [User.java](https://github.com/ftvaziri/online-shop/blob/master/src/Data/User.java)             | <code> a parent class for users </code> |
| [Seller.java](https://github.com/ftvaziri/online-shop/blob/master/src/Data/Seller.java)         | <code> a chil class for sellers (a user type) </code> |

</details>

<details closed><summary>src.base</summary>

| File                                                                                                  | Summary                         |
| ---                                                                                                   | ---                             |
| [button.java](https://github.com/ftvaziri/online-shop/blob/master/src/base/button.java)               | <code> inherited to create buttons faster with mor features </code> |
| [themeTwoPanel.java](https://github.com/ftvaziri/online-shop/blob/master/src/base/themeTwoPanel.java) | <code> inherited as a them </code> |

</details>

---

##  Getting Started

**System Requirements:**

* **Java**: `version 22.0.1`

###  Installation

> 1. Clone the online-shop repository:
>
> ```console
> $ git clone https://github.com/ftvaziri/online-shop
> ```
>
> 2. Change to the project directory:
> ```console
> $ cd online-shop
> ```
>
> 3. Install the dependencies:
> ```console
> $ mvn clean install
> ```

###  Usage

> Run online-shop using the command below:
> ```console
> $ java -jar target/myapp.jar
> ```

###  Tests

> Run the test suite using the command below:
> ```console
> $ mvn test
> ```

---

##  Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Report Issues](https://github.com/ftvaziri/online-shop/issues)**: Submit bugs found or log feature requests for the `online-shop` project.
- **[Submit Pull Requests](https://github.com/ftvaziri/online-shop/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/ftvaziri/online-shop/discussions)**: Share your insights, provide feedback, or ask questions.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/ftvaziri/online-shop
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="center">
   <a href="https://github.com{/ftvaziri/online-shop/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=ftvaziri/online-shop">
   </a>
</p>
</details>

---
