/**
 */
package experimentOntology.planning.sampling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.sampling.SamplingPackage
 * @generated
 */
public interface SamplingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamplingFactory eINSTANCE = experimentOntology.planning.sampling.impl.SamplingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Random Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Random Techinique</em>'.
	 * @generated
	 */
	SimpleRandomTechinique createSimpleRandomTechinique();

	/**
	 * Returns a new object of class '<em>Systematic Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systematic Techinique</em>'.
	 * @generated
	 */
	SystematicTechinique createSystematicTechinique();

	/**
	 * Returns a new object of class '<em>Stratified Random Sampling Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stratified Random Sampling Techinique</em>'.
	 * @generated
	 */
	StratifiedRandomSamplingTechinique createStratifiedRandomSamplingTechinique();

	/**
	 * Returns a new object of class '<em>Convenience Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convenience Sampling</em>'.
	 * @generated
	 */
	ConvenienceSampling createConvenienceSampling();

	/**
	 * Returns a new object of class '<em>Quote Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quote Sampling</em>'.
	 * @generated
	 */
	QuoteSampling createQuoteSampling();

	/**
	 * Returns a new object of class '<em>Population Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Description</em>'.
	 * @generated
	 */
	PopulationDescription createPopulationDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SamplingPackage getSamplingPackage();

} //SamplingFactory
