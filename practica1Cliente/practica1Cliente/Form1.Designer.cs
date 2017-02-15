namespace practica1Cliente
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBoxDni = new System.Windows.Forms.TextBox();
            this.buttonDni = new System.Windows.Forms.Button();
            this.labelDni = new System.Windows.Forms.Label();
            this.labelDniResult = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // textBoxDni
            // 
            this.textBoxDni.Location = new System.Drawing.Point(73, 46);
            this.textBoxDni.Name = "textBoxDni";
            this.textBoxDni.Size = new System.Drawing.Size(100, 20);
            this.textBoxDni.TabIndex = 0;
            // 
            // buttonDni
            // 
            this.buttonDni.Location = new System.Drawing.Point(73, 73);
            this.buttonDni.Name = "buttonDni";
            this.buttonDni.Size = new System.Drawing.Size(75, 23);
            this.buttonDni.TabIndex = 1;
            this.buttonDni.Text = "Valida";
            this.buttonDni.UseVisualStyleBackColor = true;
            this.buttonDni.Click += new System.EventHandler(this.buttonDni_Click);
            // 
            // labelDni
            // 
            this.labelDni.AutoSize = true;
            this.labelDni.Location = new System.Drawing.Point(70, 21);
            this.labelDni.Name = "labelDni";
            this.labelDni.Size = new System.Drawing.Size(26, 13);
            this.labelDni.TabIndex = 2;
            this.labelDni.Text = "Dni:";
            // 
            // labelDniResult
            // 
            this.labelDniResult.AutoSize = true;
            this.labelDniResult.Location = new System.Drawing.Point(70, 102);
            this.labelDniResult.Name = "labelDniResult";
            this.labelDniResult.Size = new System.Drawing.Size(10, 13);
            this.labelDniResult.TabIndex = 3;
            this.labelDniResult.Text = ".";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(507, 354);
            this.Controls.Add(this.labelDniResult);
            this.Controls.Add(this.labelDni);
            this.Controls.Add(this.buttonDni);
            this.Controls.Add(this.textBoxDni);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxDni;
        private System.Windows.Forms.Button buttonDni;
        private System.Windows.Forms.Label labelDni;
        private System.Windows.Forms.Label labelDniResult;
    }
}

