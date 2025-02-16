# AI Chat Application</p>


## Overview

An artificial intelligence chat application that uses Google's Gemini API, where you can communicate via text and images. Written using Kotlin language and Compose.


## Screenshots


<div style="display: flex; flex-wrap: wrap;">
    <img width="215" alt="chatbot1" src="https://github.com/user-attachments/assets/a0514ab7-14a6-4cc4-b63c-80df059f752c">
    <img width="215" alt="chatbot2" src="https://github.com/user-attachments/assets/bc6bd810-9c3d-4e57-9491-319280f262ae">
    <img width="215" alt="chatbot2" src="https://github.com/user-attachments/assets/23c52fcd-4457-46ec-abd1-44e734ef7be4">
    <img width="215" alt="chatbot2" src="https://github.com/user-attachments/assets/f3358155-71e8-4ba9-bc31-907c18cfe110">
</div>

## Dependencies

```kotlin
dependencies {
    
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.2")
    implementation("io.coil-kt:coil-compose:2.4.0")
    implementation("androidx.compose.material:material-icons-extended:1.6.8")
    implementation("com.google.ai.client.generativeai:generativeai:0.8.0")
    implementation(libs.accompanist.systemuicontroller)
}

```
