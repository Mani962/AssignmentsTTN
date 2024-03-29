<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Admin Dashboard</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">
 <link rel="stylesheet" href="css/font-awesome.min.css">
     <link rel="stylesheet" href="css/bootstrap.css">
  <!-- Favicons -->
  <link href="img/logo.png" rel="icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="Astyle.css" rel="stylesheet">

</head>
 <body>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#"><b>Sharda University</b></a>
      <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
          <a class="nav-link" href="#">Welcome</a>
        </li>
      </ul>
      <ul class="navbar-nav px-3">
       <li class="nav-item text-nowrap">
          <a class="nav-link" href="login1.jsp">Sign out</a>
        </li>

      </ul>
       
    </nav>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
          <div class="sidebar-sticky">
            <ul class="nav flex-column">
              <li class="nav-item">
                <a class="nav-link active" href="#">
                  <span data-feather="home"></span>
               Admin Dashboard <span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="viewCompanyDetails.html">
                  <span data-feather="shopping-cart"></span>
                  View company details
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="allstudentslist.jsp">
                  <span data-feather="bar-chart-2"></span>
                  All Students List
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="bar-chart-2"></span>
                  Students Registered
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="layers"></span>
                 Nominations List
                </a>
              </li>
            </ul>

            <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
              <span>Others</span>
              <a class="d-flex align-items-center text-muted" href="#">
                <span data-feather="plus-circle"></span>
              </a>
            </h6>
            <ul class="nav flex-column mb-2">
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  check by eligibility
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Add Students
                </a>
              </li>

              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                 Change password
                </a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link" href="companyregistration1.jsp">
                  <span data-feather="file-text"></span>
                Add company details
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  download company details
                </a>
              </li>
            </ul>
          </div>
        </nav>

        <main role="main" class= "col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
          <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
   <% 
    HttpSession hs=request.getSession();
    String name=(String)hs.getAttribute("name");
     
  %>
     <style type="text/css">
    * {
        box-sizing: border-box;
    }

    .ddr-page-wrapper {
        position: relative;
        padding: 0px;
        margin: 0px;
        font-family: sans-serif;
        font-size: 16px;
    }

    .ddr-page-wrapper .ddr-page {
        position: relative;
    }

    .ddr-page-wrapper .ddr-page .ddr-page-section-pre-content::after,
    .ddr-page-wrapper .ddr-page .ddr-page-section-pre-content::before,
    .ddr-page-wrapper .ddr-page>div::after,
    .ddr-page-wrapper .ddr-page>div::before {
        content: "";
        display: table;
        clear: both;
    }

    .ddr-page-row,
    .ddr-page-section-wrapper .ddr-page-section {
        position: relative;
        box-sizing: border-box;
    }

    .ddr-page-row {
        display: flex;
        width: 100%;
    }

    .ddr-page-row__wrap {
        flex-wrap: wrap;
    }

    .ddr-page-row__wrap .ddr-page-column__wrap {
        flex: 1 1 100%;
    }

    .ddr-page-row__wrap-reverse {
        flex-wrap: wrap-reverse;
    }

    .ddr-page-row__wrap-reverse .ddr-page-column__wrap-reverse {
        flex: 1 1 100%;
    }

    .ddr-page-column {
        display: flex;
        flex-wrap: wrap;
        box-sizing: border-box;
        position: relative;
        align-content: flex-start;
    }

    .ddr-page-widget {
        width: 100%;
        position: relative;
        overflow: hidden;
    }

    .ddr-widget {
        background-color: transparent;
        background-image: none;
        top: auto;
        bottom: auto;
        left: auto;
        right: auto;
        height: auto;
        width: auto;
        max-height: none;
        max-width: none;
        min-height: 0px;
        min-width: 0px;
        padding: 0px;
        margin: 0px;
        overflow: hidden;
    }

    .ddr-widget__rich-text {
        cursor: auto;
        overflow-wrap: break-word;
    }

    .ddr-widget__rich-text,
    .ddr-widget__video {
        position: relative;
        overflow: hidden;
    }

    .ddr-widget__video iframe {
        max-width: 100%;
        display: block;
        margin: 0px auto;
    }

    .ddr-widget__image {
        position: relative;
        max-width: 100%;
        height: auto;
        margin: auto;
        display: flex;
    }

    .ddr-widget__image a,
    .ddr-widget__image img {
        overflow: hidden;
        width: 100%;
        max-width: 100%;
        max-height: 100%;
    }

    .ddr-widget__image img {
        display: block;
    }

    .ddr-widget__image a,
    .ddr-widget__image a:active,
    .ddr-widget__image a:focus,
    .ddr-widget__image a:hover,
    .ddr-widget__image a:link,
    .ddr-widget__image a:visited {
        display: inline-block;
        vertical-align: middle;
        color: inherit;
        text-decoration: none;
        border: none;
        box-shadow: none;
    }

    .ddr-widget__headline {
        word-break: break-word;
    }

    .ddr-widget__headline,
    .ddr-widget__html,
    .ddr-widget__spacer {
        position: relative;
        overflow: hidden;
    }

    .ddr-widget__button {
        position: relative;
        display: flex;
    }

    .ddr-widget__button a {
        overflow: hidden;
    }

    .ddr-widget__button>a>div {
        display: block;
        overflow: hidden;
        background-color: rgb(0, 143, 162);
        box-sizing: content-box;
        word-break: break-all;
        transition: all 0.5s ease 0s;
    }

    .ddr-widget__button a,
    .ddr-widget__button a:active,
    .ddr-widget__button a:focus,
    .ddr-widget__button a:hover,
    .ddr-widget__button a:link,
    .ddr-widget__button a:visited {
        display: inline-block;
        vertical-align: middle;
        color: inherit;
        text-decoration: none;
        border: none;
        box-shadow: none;
    }

    .ddr-widget__icon {
        position: relative;
        text-align: center;
        overflow: hidden;
        display: flex;
    }

    .ddr-widget__icon>div {
        display: inline-block;
    }

    .ddr-widget__icon a,
    .ddr-widget__icon i {
        font: initial;
        overflow: hidden;
    }

    .ddr-widget__icon i {
        display: block;
    }

    .ddr-widget__icon a,
    .ddr-widget__icon a:active,
    .ddr-widget__icon a:focus,
    .ddr-widget__icon a:hover,
    .ddr-widget__icon a:link,
    .ddr-widget__icon a:visited {
        display: inline-block;
        vertical-align: middle;
        color: inherit;
        text-decoration: none;
        box-sizing: border-box;
        border: none;
        box-shadow: none;
    }

    .ddr-widget__slideshow {
        position: relative;
        overflow: hidden;
        height: 300px;
    }

    .ddr-widget__slideshow .slick-list,
    .ddr-widget__slideshow .slick-slide.slide-wrapper,
    .ddr-widget__slideshow .slick-slider,
    .ddr-widget__slideshow .slick-track,
    .ddr-widget__slideshow .slide,
    .ddr-widget__slideshow .slide-wrapper,
    .ddr-widget__slideshow img {
        height: 100%;
    }

    .ddr-widget__slideshow .slick-slider .slick-dots {
        width: 100%;
        bottom: 0px;
        margin: 0px;
        padding: 0px;
    }

    .ddr-widget__slideshow .slick-slider .slick-dots li {
        vertical-align: baseline;
    }

    .ddr-widget__slideshow .slideshow-arrow,
    .ddr-widget__slideshow .slideshow-dot {
        color: rgb(255, 255, 255);
        text-shadow: rgb(23, 23, 23) 1px 1px;
        font-size: 10px;
        cursor: pointer;
    }

    .ddr-widget__slideshow .slideshow-arrow {
        position: absolute;
        z-index: 99;
        top: 50%;
        font-size: 25px;
        transform: translateY(-50%);
    }

    .ddr-widget__slideshow .slideshow-arrow-left {
        left: 1%;
    }

    .ddr-widget__slideshow .slideshow-arrow-right {
        right: 1%;
    }

    .ddr-widget__slideshow .slide-wrapper .slide {
        display: flex;
        justify-content: center;
        overflow: hidden;
        background-position: 50% center;
        background-repeat: no-repeat;
        background-size: auto;
    }

    .ddr-widget__slideshow .slide-wrapper .slide img {
        user-select: none;
        margin: auto;
        flex-shrink: 0;
    }

    .ddr-widget__countdown-widget {
        position: relative;
        overflow: hidden;
        word-break: break-word;
    }

    .ddr-widget__shopify-product {
        overflow: hidden;
        text-align: center;
    }

    .ddr-widget__shopify-product iframe,
    .ddr-widget__shopify-product img {
        width: 100%;
    }

    .ddr-widget__shopify-product .ddr-shopify-product__title {
        color: rgb(61, 66, 70);
    }

    .ddr-widget__shopify-product .ddr-shopify-product__price {
        font-weight: 700;
        color: rgb(120, 129, 136);
        font-size: 1.25em;
    }

    .ddr-widget__shopify-product .ddr-shopify-product__description {
        margin: 30px 0px;
        color: rgb(120, 129, 136);
    }

    .ddr-widget__shopify-product .ddr-shopify-product__button>a {
        display: inline-block;
        vertical-align: middle;
        padding: 10px 20px;
        margin: 10px 0px;
        border: none rgb(63, 78, 174);
        font-size: 1em;
        border-radius: 3px;
        background: linear-gradient(rgb(92, 106, 196), rgb(73, 89, 189));
        text-transform: uppercase;
        font-weight: 700;
        letter-spacing: 1px;
        color: rgb(255, 255, 255);
        transition: all 0.15s ease 0s;
    }

    .ddr-widget__shopify-product .ddr-shopify-product__button>a:active,
    .ddr-widget__shopify-product .ddr-shopify-product__button>a:focus,
    .ddr-widget__shopify-product .ddr-shopify-product__button>a:hover,
    .ddr-widget__shopify-product .ddr-shopify-product__button>a:link,
    .ddr-widget__shopify-product .ddr-shopify-product__button>a:visited {
        text-decoration: none;
    }

    .ddr-widget__lightspeed-product {
        overflow: hidden;
    }

    .ddr-widget__lightspeed-product iframe,
    .ddr-widget__lightspeed-product img {
        width: 100%;
    }

    .ddr-widget__lightspeed-product .btn {
        display: block;
        padding: 10px 15px;
        margin: 10px 0px;
        border: none;
        cursor: pointer;
        transition: all 0.15s ease 0s;
    }

    .ddr-widget__lightspeed-product .btn--primary {
        background-color: rgb(0, 143, 162);
        color: rgb(239, 253, 255);
    }

    .ddr-widget__lightspeed-product .btn--primary:hover {
        background-color: rgb(0, 132, 149);
    }

    .ddr-widget__lightspeed-product .btn--expand {
        width: 100%;
    }

    .ddr-widget__lightspeed-product .btn--uppercase {
        text-transform: uppercase;
    }

    .ddr-widget__lightspeed-product .btn--no-margin {
        margin: 0px;
    }

    .ddr-widget__lightspeed-product .ddr-lightspeed-product__title {
        color: rgb(61, 66, 70);
    }

    .ddr-widget__lightspeed-product .ddr-lightspeed-product__price {
        font-weight: 700;
        color: rgb(120, 129, 136);
        font-size: 1.25em;
    }

    .ddr-widget__lightspeed-product .ddr-lightspeed-product__description {
        margin: 30px 0px;
        color: rgb(120, 129, 136);
    }

    .ddr-widget__magento-2-product {
        overflow: hidden;
    }

    .ddr-widget__magento-2-product iframe,
    .ddr-widget__magento-2-product img {
        width: 100%;
    }

    .ddr-widget__magento-2-product .btn {
        display: block;
        padding: 10px 15px;
        margin: 10px 0px;
        border: none;
        cursor: pointer;
        font-size: 15px;
        max-height: 40px;
        transition: all 0.15s ease 0s;
    }

    .ddr-widget__magento-2-product .btn--primary {
        background-color: rgb(0, 143, 162);
        color: rgb(239, 253, 255);
    }

    .ddr-widget__magento-2-product .btn--primary:hover {
        background-color: rgb(0, 132, 149);
    }

    .ddr-widget__magento-2-product .btn--expand {
        width: 100%;
    }

    .ddr-widget__magento-2-product .btn--uppercase {
        text-transform: uppercase;
    }

    .ddr-widget__magento-2-product .btn--no-margin {
        margin: 0px;
    }

    .ddr-widget__magento-2-product .ddr-magento-2-product__title {
        color: rgb(61, 66, 70);
    }

    .ddr-widget__magento-2-product .ddr-magento-2-product__price {
        font-weight: 700;
        color: rgb(120, 129, 136);
        font-size: 1.25em;
    }

    .ddr-widget__magento-2-product .ddr-magento-2-product__description {
        margin: 30px 0px;
        color: rgb(120, 129, 136);
    }

    .ddr-widget__woocommerce-product {
        overflow: hidden;
        text-align: center;
    }

    .ddr-widget__woocommerce-product iframe,
    .ddr-widget__woocommerce-product img {
        width: 100%;
    }

    .ddr-widget__woocommerce-product .ddr-woocommerce-product__title {
        color: rgb(61, 66, 70);
    }

    .ddr-widget__woocommerce-product .ddr-woocommerce-product__price {
        font-weight: 700;
        color: rgb(120, 129, 136);
        font-size: 1.25em;
    }

    .ddr-widget__woocommerce-product .ddr-woocommerce-product__description {
        margin: 30px 0px;
        color: rgb(120, 129, 136);
    }

    .ddr-widget__woocommerce-product .ddr-woocommerce-product__button>a {
        display: inline-block;
        vertical-align: middle;
        padding: 10px 20px;
        margin: 10px 0px;
        border: none rgb(63, 78, 174);
        font-size: 1em;
        border-radius: 3px;
        background: linear-gradient(rgb(92, 106, 196), rgb(73, 89, 189));
        text-transform: uppercase;
        font-weight: 700;
        letter-spacing: 1px;
        color: rgb(255, 255, 255);
        transition: all 0.15s ease 0s;
    }

    .ddr-widget__woocommerce-product .ddr-woocommerce-product__button>a:active,
    .ddr-widget__woocommerce-product .ddr-woocommerce-product__button>a:focus,
    .ddr-widget__woocommerce-product .ddr-woocommerce-product__button>a:hover,
    .ddr-widget__woocommerce-product .ddr-woocommerce-product__button>a:link,
    .ddr-widget__woocommerce-product .ddr-woocommerce-product__button>a:visited {
        text-decoration: none;
    }

    .ddr-widget__facebook {
        overflow: hidden;
    }

    .ddr-widget__facebook iframe {
        max-width: 100%;
    }

    .ddr-widget__facebook * {
        width: 100% !important;
    }

    .ddr-widget__facebook-comment,
    .ddr-widget__facebook-like {
        overflow: hidden;
    }

    .ddr-widget__form-wrapper .ddr-widget__form {
        display: flex;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-label {
        display: flex;
        overflow: hidden;
        width: 30%;
        font-weight: 700;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-label>div {
        margin-top: 5px;
        margin-right: 5px;
        margin-bottom: 5px;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-value {
        display: flex;
        width: 70%;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-value>div,
    .ddr-widget__form-wrapper .ddr-widget__form-value>input {
        padding: 4px 3px;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-value>input,
    .ddr-widget__form-wrapper .ddr-widget__form-value>select,
    .ddr-widget__form-wrapper .ddr-widget__form-value>textarea {
        font-family: sans-serif;
        width: 250px;
        border: 1px solid rgb(169, 169, 169);
        max-width: 100%;
        padding: 4px 3px;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-right .ddr-widget__form-label {
        justify-content: flex-end;
        padding-right: 15px;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-left .ddr-widget__form-label {
        justify-content: flex-start;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-top {
        flex-direction: column;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-top .ddr-widget__form-label,
    .ddr-widget__form-wrapper .ddr-widget__form-top .ddr-widget__form-value {
        width: 100%;
    }

    @media (max-width: 480px) {
        .ddr-widget__form-wrapper .ddr-widget__form {
            flex-direction: column;
        }
        .ddr-widget__form-wrapper .ddr-widget__form-label,
        .ddr-widget__form-wrapper .ddr-widget__form-value,
        .ddr-widget__form-wrapper .ddr-widget__form-value>input,
        .ddr-widget__form-wrapper .ddr-widget__form-value>select,
        .ddr-widget__form-wrapper .ddr-widget__form-value>textarea {
            width: 100%;
        }
    }

    .ddr-widget__form-wrapper .ddr-widget__form-textarea textarea {
        resize: both;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-single-choice-option-wrapper {
        flex-direction: column;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-single-choice-option {
        margin-bottom: 5px;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-multiple-choice-option-wrapper {
        flex-direction: column;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-multiple-choice-option {
        margin-bottom: 5px;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-submit {
        position: relative;
        display: flex;
    }

    .ddr-widget__form-wrapper .ddr-widget__form-submit>button {
        display: block;
        overflow: hidden;
        background-color: rgb(0, 143, 162);
        box-sizing: content-box;
        word-break: break-all;
        transition: all 0.5s ease 0s;
        border: none;
        cursor: pointer;
        box-shadow: none;
        color: inherit;
    }

    .ddr-widget__magento-1-product {
        overflow: hidden;
    }

    .ddr-widget__magento-1-product iframe,
    .ddr-widget__magento-1-product img {
        width: 100%;
    }

    .ddr-widget__magento-1-product .btn {
        display: block;
        padding: 10px 15px;
        margin: 10px 0px;
        border: none;
        cursor: pointer;
        font-size: 15px;
        max-height: 40px;
        transition: all 0.15s ease 0s;
    }

    .ddr-widget__magento-1-product .btn--primary {
        background-color: rgb(0, 143, 162);
        color: rgb(239, 253, 255);
    }

    .ddr-widget__magento-1-product .btn--primary:hover {
        background-color: rgb(0, 132, 149);
    }

    .ddr-widget__magento-1-product .btn--expand {
        width: 100%;
    }

    .ddr-widget__magento-1-product .btn--uppercase {
        text-transform: uppercase;
    }

    .ddr-widget__magento-1-product .btn--no-margin {
        margin: 0px;
    }

    .ddr-widget__magento-1-product .ddr-magento-1-product__title {
        color: rgb(61, 66, 70);
    }

    .ddr-widget__magento-1-product .ddr-magento-1-product__price {
        font-weight: 700;
        color: rgb(120, 129, 136);
        font-size: 1.25em;
    }

    .ddr-widget__magento-1-product .ddr-magento-1-product__description {
        margin: 30px 0px;
        color: rgb(120, 129, 136);
    }

    .ddr-widget__generic-collection {
        position: relative;
        display: flex;
        align-items: center;
    }

    .ddr-widget__generic-collection .loader-wrapper {
        background: rgba(255, 255, 255, 0.7);
        position: absolute;
        z-index: 100;
        top: 0px;
        right: 0px;
        bottom: 0px;
        left: 0px;
        display: none;
        cursor: wait;
    }

    .ddr-widget__generic-collection [class*=" ddr-icon-"]::before,
    .ddr-widget__generic-collection [class^="ddr-icon-"]::before {
        margin: 0px;
    }

    .ddr-widget__generic-collection .generic-collection__list-left,
    .ddr-widget__generic-collection .generic-collection__list-right {
        font-size: 30px;
    }

    .ddr-widget__generic-collection .generic-collection__list-left .fallback,
    .ddr-widget__generic-collection .generic-collection__list-right .fallback {
        font-size: 60px;
    }

    .ddr-widget__generic-collection .generic-collection__list-left:hover,
    .ddr-widget__generic-collection .generic-collection__list-right:hover {
        cursor: pointer;
    }

    .ddr-widget__generic-collection .generic-collection__list-left.disabled,
    .ddr-widget__generic-collection .generic-collection__list-right.disabled {
        color: rgb(193, 193, 193);
    }

    .ddr-widget__generic-collection .generic-collection__content {
        display: block;
        width: 100%;
    }

    .ddr-widget__generic-collection .generic-collection__items {
        display: flex;
        flex-flow: row wrap;
    }

    .ddr-widget__generic-collection .generic-collection__item:hover {
        cursor: pointer;
    }

    .ddr-widget__generic-collection .generic-collection__pagination {
        text-align: center;
        font-size: 24px;
    }

    .ddr-widget__generic-collection .generic-collection__pagination .ddr-icon-left-open-mini::before,
    .ddr-widget__generic-collection .generic-collection__pagination .ddr-icon-right-open-mini::before {
        width: 0.5em;
    }

    .ddr-widget__generic-collection .generic-collection__pagination .fallback {
        vertical-align: text-bottom;
    }

    .ddr-widget__generic-collection .generic-collection__pagination-next:hover,
    .ddr-widget__generic-collection .generic-collection__pagination-prev:hover {
        cursor: pointer;
    }

    .ddr-widget__generic-collection .generic-collection__pagination-next.disabled,
    .ddr-widget__generic-collection .generic-collection__pagination-prev.disabled {
        display: none !important;
    }

    .ddr-widget__generic-collection .generic-collection__columns-1 .generic-collection__item {
        width: 100%;
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-1 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-2 .generic-collection__item {
        width: 50%;
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-2 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-3 .generic-collection__item {
        width: 33.3333%;
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-3 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-3 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-4 .generic-collection__item {
        width: 25%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-4 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-4 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-4 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-5 .generic-collection__item {
        width: 20%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-5 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-5 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-5 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-6 .generic-collection__item {
        width: 16.6667%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-6 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-6 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-6 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-7 .generic-collection__item {
        width: 14.2857%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-7 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-7 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-7 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-8 .generic-collection__item {
        width: 12.5%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-8 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-8 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-8 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-9 .generic-collection__item {
        width: 11.1111%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-9 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-9 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-9 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-10 .generic-collection__item {
        width: 10%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-10 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-10 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-10 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-11 .generic-collection__item {
        width: 9.09091%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-11 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-11 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-11 .generic-collection__item {
            width: 100%;
        }
    }

    .ddr-widget__generic-collection .generic-collection__columns-12 .generic-collection__item {
        width: 8.33333%;
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection__columns-12 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection__columns-12 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection__columns-12 .generic-collection__item {
            width: 100%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-1 .generic-collection__item {
            width: 100%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-2 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-3 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-4 .generic-collection__item {
            width: 25%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-5 .generic-collection__item {
            width: 20%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-6 .generic-collection__item {
            width: 16.6667%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-7 .generic-collection__item {
            width: 14.2857%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-8 .generic-collection__item {
            width: 12.5%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-9 .generic-collection__item {
            width: 11.1111%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-10 .generic-collection__item {
            width: 10%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-11 .generic-collection__item {
            width: 9.09091%;
        }
    }

    @media (max-width: 1024px) {
        .ddr-widget__generic-collection .generic-collection-1024__columns-12 .generic-collection__item {
            width: 8.33333%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-1 .generic-collection__item {
            width: 100%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-2 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-3 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-4 .generic-collection__item {
            width: 25%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-5 .generic-collection__item {
            width: 20%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-6 .generic-collection__item {
            width: 16.6667%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-7 .generic-collection__item {
            width: 14.2857%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-8 .generic-collection__item {
            width: 12.5%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-9 .generic-collection__item {
            width: 11.1111%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-10 .generic-collection__item {
            width: 10%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-11 .generic-collection__item {
            width: 9.09091%;
        }
    }

    @media (max-width: 768px) {
        .ddr-widget__generic-collection .generic-collection-768__columns-12 .generic-collection__item {
            width: 8.33333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-1 .generic-collection__item {
            width: 100%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-2 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-3 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-4 .generic-collection__item {
            width: 25%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-5 .generic-collection__item {
            width: 20%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-6 .generic-collection__item {
            width: 16.6667%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-7 .generic-collection__item {
            width: 14.2857%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-8 .generic-collection__item {
            width: 12.5%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-9 .generic-collection__item {
            width: 11.1111%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-10 .generic-collection__item {
            width: 10%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-11 .generic-collection__item {
            width: 9.09091%;
        }
    }

    @media (max-width: 480px) {
        .ddr-widget__generic-collection .generic-collection-480__columns-12 .generic-collection__item {
            width: 8.33333%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-1 .generic-collection__item {
            width: 100%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-2 .generic-collection__item {
            width: 50%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-3 .generic-collection__item {
            width: 33.3333%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-4 .generic-collection__item {
            width: 25%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-5 .generic-collection__item {
            width: 20%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-6 .generic-collection__item {
            width: 16.6667%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-7 .generic-collection__item {
            width: 14.2857%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-8 .generic-collection__item {
            width: 12.5%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-9 .generic-collection__item {
            width: 11.1111%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-10 .generic-collection__item {
            width: 10%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-11 .generic-collection__item {
            width: 9.09091%;
        }
    }

    @media (max-width: 320px) {
        .ddr-widget__generic-collection .generic-collection-320__columns-12 .generic-collection__item {
            width: 8.33333%;
        }
    }

    @media (min-width: 1025px) {
        .ddr-page-row__wrap--max {
            flex-wrap: wrap;
        }
        .ddr-page-row__wrap--max .ddr-page-column__wrap--max {
            flex: 1 1 100%;
        }
        .ddr-page-row__wrap-reverse--max {
            flex-wrap: wrap-reverse;
        }
        .ddr-page-row__wrap-reverse--max .ddr-page-column__wrap-reverse--max {
            flex: 1 1 100%;
        }
        .ddr-page-column__hide--max,
        .ddr-page-widget__hide--max {
            display: none;
        }
    }

    @media (max-width: 1024px) and (min-width: 769px) {
        .ddr-page-row__wrap--1024 {
            flex-wrap: wrap;
        }
        .ddr-page-row__wrap--1024 .ddr-page-column__wrap--1024 {
            flex: 1 1 100%;
        }
        .ddr-page-row__wrap-reverse--1024 {
            flex-wrap: wrap-reverse;
        }
        .ddr-page-row__wrap-reverse--1024 .ddr-page-column__wrap-reverse--1024 {
            flex: 1 1 100%;
        }
        .ddr-page-column__hide--1024,
        .ddr-page-widget__hide--1024 {
            display: none;
        }
    }

    @media (max-width: 768px) and (min-width: 481px) {
        .ddr-page-row__wrap--768 {
            flex-wrap: wrap;
        }
        .ddr-page-row__wrap--768 .ddr-page-column__wrap--768 {
            flex: 1 1 100%;
        }
        .ddr-page-row__wrap-reverse--768 {
            flex-wrap: wrap-reverse;
        }
        .ddr-page-row__wrap-reverse--768 .ddr-page-column__wrap-reverse--768 {
            flex: 1 1 100%;
        }
        .ddr-page-column__hide--768,
        .ddr-page-widget__hide--768 {
            display: none;
        }
    }

    @media (max-width: 480px) and (min-width: 321px) {
        .ddr-page-row__wrap--480 {
            flex-wrap: wrap;
        }
        .ddr-page-row__wrap--480 .ddr-page-column__wrap--480 {
            flex: 1 1 100%;
        }
        .ddr-page-row__wrap-reverse--480 {
            flex-wrap: wrap-reverse;
        }
        .ddr-page-row__wrap-reverse--480 .ddr-page-column__wrap-reverse--480 {
            flex: 1 1 100%;
        }
        .ddr-page-column__hide--480,
        .ddr-page-widget__hide--480 {
            display: none;
        }
    }

    @media (max-width: 320px) and (min-width: 0px) {
        .ddr-page-row__wrap--320 {
            flex-wrap: wrap;
        }
        .ddr-page-row__wrap--320 .ddr-page-column__wrap--320 {
            flex: 1 1 100%;
        }
        .ddr-page-row__wrap-reverse--320 {
            flex-wrap: wrap-reverse;
        }
        .ddr-page-row__wrap-reverse--320 .ddr-page-column__wrap-reverse--320 {
            flex: 1 1 100%;
        }
        .ddr-page-column__hide--320,
        .ddr-page-widget__hide--320 {
            display: none;
        }
    }

    #ddr-rich-text-111 * {
        line-height: 1.7;
    }

    #button-112 {
        background-color: rgba(39, 183, 243, 1);
        color: rgba(255, 255, 255, 1);
    }

    #ddr-rich-text-141 * {
        line-height: 1.7;
    }

    #button-142 {
        background-color: rgba(39, 183, 243, 1);
        color: rgba(255, 255, 255, 1);
    }

    #ddr-rich-text-171 * {
        line-height: 1.7;
    }

    #button-172 {
        background-color: rgba(39, 183, 243, 1);
        color: rgba(255, 255, 255, 1);
    }
</style>
<div class="ddr-page-wrapper" data-ddr-page-id="67e99126-042b-11e9-a90b-0242ac140005">
    <div class="ddr-page">
        <div class="ddr-page-section-wrapper ddr-page-section-wrapper-0">
            <div class="ddr-page-section-pre-content ddr-page-section-pre-content-0" style="max-width: 1200px; margin: auto;">
                <div class="ddr-page-section ddr-page-section-0">
                    <div class="ddr-page-row ddr-page-row-0 ddr-page-row__wrap--320 ddr-page-row__wrap--480 ddr-page-row__wrap--768">
                        <div class="ddr-page-column ddr-page-column-0 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 100%;">
                            <div id="ddr-page-widget-000" class="ddr-page-widget ddr-page-widget__headline ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <h1 class="ddr-widget__headline" style="margin: 50px 30px; text-align: center; font-size: 45px;">welcome :<%=name%> </h1>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="ddr-page-row ddr-page-row-1 ddr-page-row__wrap--320 ddr-page-row__wrap--480 ddr-page-row__wrap--768">
                        <div class="ddr-page-column ddr-page-column-0 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 2.77778%;">
                            <div id="ddr-page-widget-100" class="ddr-page-widget ddr-page-widget__spacer ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <div class="ddr-widget__spacer" style="height: 25px;"></div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-1 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 27.7778%;">
                            <div id="ddr-page-widget-110" class="ddr-page-widget ddr-page-widget__headline ddr-page-widget-0 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <h2 class="ddr-widget__headline" style="margin: 30px 30px 15px; text-align: center; color: rgb(25, 77, 26);">Student information</h2>
                                </div>
                            </div>
                            <div id="ddr-page-widget-111" class="ddr-page-widget ddr-page-widget__rich-text ddr-page-widget-1 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <div id="ddr-rich-text-111" class="ddr-widget__rich-text" style="margin: 15px 30px;">
                                        <p>All student information is stored here...</p>
                                    </div>
                                </div>
                            </div>
                            <div id="ddr-page-widget-112" class="ddr-page-widget ddr-page-widget__button ddr-page-widget-2 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <div class="ddr-widget__button" style="justify-content: center;">
                                        <a href="allstudentinfo.jsp" target="_blank" style="margin: 30px; border-radius: 4px;">
                                            <div id="button-112" style="padding: 10px 20px;">Click here</div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-2 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 2.77778%;">
                            <div id="ddr-page-widget-120" class="ddr-page-widget ddr-page-widget__spacer ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <div class="ddr-widget__spacer" style="height: 25px;"></div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-3 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 2.77778%;">
                            <div id="ddr-page-widget-130" class="ddr-page-widget ddr-page-widget__spacer ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <div class="ddr-widget__spacer" style="height: 25px;"></div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-4 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 27.7778%;">
                            <div id="ddr-page-widget-140" class="ddr-page-widget ddr-page-widget__headline ddr-page-widget-0 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <h2 class="ddr-widget__headline" style="margin: 30px 30px 15px; text-align: center; color: rgb(38, 77, 25);">Company Information</h2>
                                </div>
                            </div>
                            <div id="ddr-page-widget-141" class="ddr-page-widget ddr-page-widget__rich-text ddr-page-widget-1 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <div id="ddr-rich-text-141" class="ddr-widget__rich-text" style="margin: 15px 30px;">
                                        <p style="text-align: center;">All Company information is stored here...</p>
                                    </div>
                                </div>
                            </div>
                            <div id="ddr-page-widget-142" class="ddr-page-widget ddr-page-widget__button ddr-page-widget-2 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <div class="ddr-widget__button" style="justify-content: center;">
                                        <a href="allcompanyinfo.jsp" target="_blank" style="margin: 30px; border-radius: 4px;">
                                            <div id="button-142" style="padding: 10px 20px;">Click here</div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-5 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 2.77778%;">
                            <div id="ddr-page-widget-150" class="ddr-page-widget ddr-page-widget__spacer ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <div class="ddr-widget__spacer" style="height: 28px;"></div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-6 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 2.77778%;">
                            <div id="ddr-page-widget-160" class="ddr-page-widget ddr-page-widget__spacer ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <div class="ddr-widget__spacer" style="height: 28px;"></div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-7 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 27.7778%;">
                            <div id="ddr-page-widget-170" class="ddr-page-widget ddr-page-widget__headline ddr-page-widget-0 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <h2 class="ddr-widget__headline" style="margin: 30px 30px 15px; text-align: center; color: rgb(38, 77, 25);">Placement Information</h2>
                                </div>
                            </div>
                            <div id="ddr-page-widget-171" class="ddr-page-widget ddr-page-widget__rich-text ddr-page-widget-1 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <div id="ddr-rich-text-171" class="ddr-widget__rich-text" style="margin: 15px 30px;">
                                        <p style="text-align: center;">All Placement information is stored here...</p>
                                    </div>
                                </div>
                            </div>
                            <div id="ddr-page-widget-172" class="ddr-page-widget ddr-page-widget__button ddr-page-widget-2 ">
                                <div class="ddr-widget" style="background-color: rgb(250, 250, 250);">
                                    <div class="ddr-widget__button" style="justify-content: center;">
                                        <a href="allplacementinfo.jsp" target="_blank" style="margin: 30px; border-radius: 4px;">
                                            <div id="button-172" style="padding: 10px 20px;">Click here</div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="ddr-page-column ddr-page-column-8 ddr-page-column__wrap--320 ddr-page-column__wrap--480 ddr-page-column__wrap--768 " style="width: 2.77778%;">
                            <div id="ddr-page-widget-180" class="ddr-page-widget ddr-page-widget__spacer ddr-page-widget-0 ">
                                <div class="ddr-widget">
                                    <div class="ddr-widget__spacer" style="height: 27px;"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>       
            
          </div>
        </main>
      </div>
    </div>
</body>
</html>
