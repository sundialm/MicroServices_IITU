<#macro layout header_links = "" custom_css = "" custom_scripts="" scripts=[]>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/css/index.css">
        <title>Main</title>
    </head>
    <body>
    <header class="header">
        <div class="container">
            <div class="header__up">
                <div class="logo_wrapper">
                    <a href="/" class="header__logo">
                        <img src="images/logo.png" alt="logo">
                    </a>
                </div>
                <div class="header__menu">
                   <a href="/manufacturers" class="menu__item">manufactures</a>
                   <a href="/products" class="menu__item">products</a>
                   <a href="/" class="menu__item activ-link">about</a>
                </div>
            </div>
        </div>
    </header>

    <main>
        <#nested/>
    </main>

    <footer class="footer">
        <div class="container">
            <div class="footer__menu">
                <div class="footer__menu-col">
                    <a href="#" class="footer__link">About us</a>
                    <a href="#" class="footer__link">Support</a>
                    <a href="#" class="footer__link">Why buy</a>
                    <a href="#" class="footer__link">Affiliates</a>
                </div>
                <div class="footer__menu-col">
                    <a href="#" class="footer__link">Contact us</a>
                    <a href="#" class="footer__link">Returns</a>
                </div>
            </div>
            <div class="footer__copyright">
                <p class="footer__text">Made in Melbourne By BlazRobar.com @BlazRobar</p>
                <p class="footer__text">Copyright &copy; 2016, Cool stuff here</p>
            </div>
        </div>
    </footer>

    </body>
    </html>


    <#list scripts as scriptSource>
        <script src="${scriptSource}"></script>
    </#list>


</#macro>