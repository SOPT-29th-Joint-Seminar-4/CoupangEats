package com.sopt.jointseminargroupfour.util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

sealed class BaseView {
    abstract class BaseActivity<T : ViewDataBinding>(@LayoutRes val layoutRes: Int) :
        AppCompatActivity() {
        protected lateinit var binding: T
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = DataBindingUtil.setContentView(this, layoutRes)
            binding.lifecycleOwner = this
        }
    }

    abstract class BaseFragment<T : ViewDataBinding>(@LayoutRes val layoutRes: Int) : Fragment() {

        private var _binding: T? = null
        protected val binding get() = _binding ?: error("binding이 초기화되지 않았습니다.")

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
            binding.lifecycleOwner = viewLifecycleOwner
            return binding.root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
}