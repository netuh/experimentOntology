/**
 */
package experimentOntology.planning.sampling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Techinique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.sampling.ProbabilityTechinique#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.sampling.SamplingPackage#getProbabilityTechinique()
 * @model abstract="true"
 * @generated
 */
public interface ProbabilityTechinique extends SamplingStrategy {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(PopulationDescription)
	 * @see experimentOntology.planning.sampling.SamplingPackage#getProbabilityTechinique_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PopulationDescription getPopulation();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.sampling.ProbabilityTechinique#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(PopulationDescription value);

} // ProbabilityTechinique
