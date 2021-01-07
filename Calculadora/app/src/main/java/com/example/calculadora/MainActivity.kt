package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import kotlin.math.pow
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

    var valor1 = StringBuilder()
    var valor2 = StringBuilder()
    var operation = false
    var clear = false
    var soma = false
    var sub = false
    var mul = false
    var sqr = false
    var div = false
    var pot = false
    var mod = false

    fun operacao(): Any {
        var res = 0.0
        val val1 = valor1.toString()
        val valor1 = val1.toDouble()
        val val2 = valor2.toString()
        val valor2 = val2.toDouble()
        if(soma){
           res = valor1 + valor2
        }else if(sub){
           res = valor1 - valor2
        }else if(mul){
           res = valor1 * valor2
        }else if(sqr){
           res = sqrt(valor1)
        }else if(div){
           res = valor1 / valor2
        }else if(pot){
           res = valor1.pow(valor2)
        }else if(mod){
           res = valor1 % valor2
        }
        if(res.toString().toDouble() % 2 == 0.0 || res == 1.0){
            textView.text = res.toInt().toString()
            return res.toInt()
        }else {
            textView.text = res.toString()
            return res
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button.text)
                textView.text = valor1
            }else{
                valor2.append(button.text)
                textView.text = valor2
            }
        }
        button2.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button2.text)
                textView.text = valor1
            }else{
                valor2.append(button2.text)
                textView.text = valor2
            }
        }
        button3.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button3.text)
                textView.text = valor1
            }else{
                valor2.append(button3.text)
                textView.text = valor2
            }
        }
        button4.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button4.text)
                textView.text = valor1
            }else{
                valor2.append(button4.text)
                textView.text = valor2
            }
        }
        button5.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button5.text)
                textView.text = valor1
            }else{
                valor2.append(button5.text)
                textView.text = valor2
            }
        }
        button6.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button6.text)
                textView.text = valor1
            }else{
                valor2.append(button6.text)
                textView.text = valor2
            }
        }
        button7.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button7.text)
                textView.text = valor1
            }else{
                valor2.append(button7.text)
                textView.text = valor2
            }
        }
        button8.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button8.text)
                textView.text = valor1
            }else{
                valor2.append(button8.text)
                textView.text = valor2
            }
        }
        button9.setOnClickListener {
            if(!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button9.text)
                textView.text = valor1
            }else{
                valor2.append(button9.text)
                textView.text = valor2
            }
        }
        button10.setOnClickListener {
            if (!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(button10.text)
                textView.text = valor1
            }else{
                valor2.append(button10.text)
                textView.text = valor2
            }
        }
        buttonFloat.setOnClickListener{
            if (!operation) {
                if(clear){
                    valor1.clear()
                    clear = false
                }
                valor1.append(buttonFloat.text)
                textView.text = valor1
            }else{
                valor2.append(buttonFloat.text)
                textView.text = valor2
            }
        }
        buttonAdd.setOnClickListener {
            if (!operation || clear) {
                clear = false
                if (valor1.isEmpty()) {
                    valor1.append(0)
                } else {
                    soma = true
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = false
                    mod = false
                    operation = true
                    textView.text = "0"
                }
            } else {
                if (valor2.isEmpty()) {
                    valor2.append(0)
                } else {
                    val res = operacao()
                    valor1.clear()
                    valor1.append(res.toString())
                    soma = true
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = false
                    mod = false
                    valor2.clear()
                    textView.text = res.toString()
                }
            }
        }
            buttonSub.setOnClickListener {
                if(!operation || clear) {
                    clear = false
                    if(valor1.isEmpty()){
                        valor1.append(0)
                    }else {
                        soma = false
                        sub = true
                        mul = false
                        sqr = false
                        div = false
                        pot = false
                        mod = false
                        operation = true
                        textView.text = "0"
                    }
                }else{
                    if(valor2.isEmpty()){
                        valor2.append(0)
                    }else {
                        val res = operacao()
                        valor1.clear()
                        valor1.append(res.toString())
                        soma = false
                        sub = true
                        mul = false
                        sqr = false
                        div = false
                        pot = false
                        mod = false
                        valor2.clear()
                        textView.text = res.toString()
                    }
                }
            }
            buttonMul.setOnClickListener {
                if(!operation || clear) {
                    clear = false
                    if (valor1.isEmpty()) {
                        valor1.append(0)
                    }else{
                        soma = false
                        sub = false
                        mul = true
                        sqr = false
                        div = false
                        pot = false
                        mod = false
                        operation = true
                        textView.text = "0"
                    }
                }else{
                    if(valor2.isEmpty()){
                        valor2.append(0)
                    }else {
                        val res = operacao()
                        valor1.clear()
                        valor1.append(res.toString())
                        soma = false
                        sub = false
                        mul = true
                        sqr = false
                        div = false
                        pot = false
                        mod = false
                        valor2.clear()
                        textView.text = res.toString()
                    }
                }
            }
        buttonSqr.setOnClickListener {
            if(!operation || clear) {
                clear = false
                if (valor1.isEmpty()) {
                    valor1.append(0)
                }else{
                    if(valor2.isEmpty()){
                        valor2.append(0)
                    }
                    soma = false
                    sub = false
                    mul = false
                    sqr = true
                    div = false
                    pot = false
                    mod = false
                    val res = operacao().toString()
                    valor1.clear()
                    valor1.append(res)
                    valor2.clear()
                    clear = true
                }
            }else{
                if(valor2.isEmpty()){
                    valor2.append(0)
                }else {
                    if(valor1.isEmpty()){
                        valor1.append(0)
                    }
                    var res = operacao().toString()
                    textView.text = res
                    operation = false
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = false
                    mod = false
                    clear = true
                    valor1.clear()
                    valor1.append(res)
                    sqr = true
                    res = operacao().toString()
                    valor1.clear()
                    valor1.append(res)
                    valor2.clear()
                    clear = true
                }
            }
        }
        buttonDiv.setOnClickListener {
            if(!operation || clear) {
                clear = false
                if (valor1.isEmpty()) {
                    valor1.append(0)
                }else{
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = true
                    pot = false
                    mod = false
                    operation = true
                    textView.text = "0"
                }
            }else{
                if(valor2.isEmpty()){
                    valor2.append(0)
                }else {
                    val res = operacao()
                    valor1.clear()
                    valor1.append(res.toString())
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = true
                    pot = false
                    mod = false
                    valor2.clear()
                    textView.text = res.toString()
                }
            }
        }
        buttonPot.setOnClickListener {
            if(!operation || clear) {
                clear = false
                if (valor1.isEmpty()) {
                    valor1.append(0)
                }else{
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = true
                    mod = false
                    operation = true
                    textView.text = "0"
                }
            }else{
                if(valor2.isEmpty()){
                    valor2.append(0)
                }else {
                    val res = operacao()
                    valor1.clear()
                    valor1.append(res.toString())
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = true
                    mod = false
                    valor2.clear()
                    textView.text = res.toString()
                }
            }
        }
        buttonMod.setOnClickListener{
            if(!operation || clear) {
                clear = false
                if (valor1.isEmpty()) {
                    valor1.append(0)
                }else{
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = false
                    mod = true
                    operation = true
                    textView.text = "0"
                }
            }else{
                if(valor2.isEmpty()){
                    valor2.append(0)
                }else {
                    val res = operacao()
                    valor1.clear()
                    valor1.append(res.toString())
                    soma = false
                    sub = false
                    mul = false
                    sqr = false
                    div = false
                    pot = false
                    mod = true
                    valor2.clear()
                    textView.text = res.toString()
                }
            }
        }
            buttonResult.setOnClickListener{
                val res = operacao().toString()
                textView.text = res
                operation = false
                soma = false
                sub = false
                mul = false
                sqr = false
                div = false
                clear = true
                valor1.clear()
                valor1.append(res)
                valor2.clear()
            }

    }
}