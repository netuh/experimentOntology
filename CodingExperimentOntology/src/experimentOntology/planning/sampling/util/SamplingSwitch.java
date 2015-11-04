/**
 */
package experimentOntology.planning.sampling.util;

import experimentOntology.planning.sampling.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.sampling.SamplingPackage
 * @generated
 */
public class SamplingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SamplingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingSwitch() {
		if (modelPackage == null) {
			modelPackage = SamplingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SamplingPackage.SAMPLING_STRATEGY: {
				SamplingStrategy samplingStrategy = (SamplingStrategy)theEObject;
				T result = caseSamplingStrategy(samplingStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.PROBABILITY_TECHINIQUE: {
				ProbabilityTechinique probabilityTechinique = (ProbabilityTechinique)theEObject;
				T result = caseProbabilityTechinique(probabilityTechinique);
				if (result == null) result = caseSamplingStrategy(probabilityTechinique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.SIMPLE_RANDOM_TECHINIQUE: {
				SimpleRandomTechinique simpleRandomTechinique = (SimpleRandomTechinique)theEObject;
				T result = caseSimpleRandomTechinique(simpleRandomTechinique);
				if (result == null) result = caseProbabilityTechinique(simpleRandomTechinique);
				if (result == null) result = caseSamplingStrategy(simpleRandomTechinique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.SYSTEMATIC_TECHINIQUE: {
				SystematicTechinique systematicTechinique = (SystematicTechinique)theEObject;
				T result = caseSystematicTechinique(systematicTechinique);
				if (result == null) result = caseProbabilityTechinique(systematicTechinique);
				if (result == null) result = caseSamplingStrategy(systematicTechinique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.STRATIFIED_RANDOM_SAMPLING_TECHINIQUE: {
				StratifiedRandomSamplingTechinique stratifiedRandomSamplingTechinique = (StratifiedRandomSamplingTechinique)theEObject;
				T result = caseStratifiedRandomSamplingTechinique(stratifiedRandomSamplingTechinique);
				if (result == null) result = caseProbabilityTechinique(stratifiedRandomSamplingTechinique);
				if (result == null) result = caseSamplingStrategy(stratifiedRandomSamplingTechinique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.NO_PROBABILITY_TECHINIQUE: {
				NoProbabilityTechinique noProbabilityTechinique = (NoProbabilityTechinique)theEObject;
				T result = caseNoProbabilityTechinique(noProbabilityTechinique);
				if (result == null) result = caseSamplingStrategy(noProbabilityTechinique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.CONVENIENCE_SAMPLING: {
				ConvenienceSampling convenienceSampling = (ConvenienceSampling)theEObject;
				T result = caseConvenienceSampling(convenienceSampling);
				if (result == null) result = caseNoProbabilityTechinique(convenienceSampling);
				if (result == null) result = caseSamplingStrategy(convenienceSampling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.QUOTE_SAMPLING: {
				QuoteSampling quoteSampling = (QuoteSampling)theEObject;
				T result = caseQuoteSampling(quoteSampling);
				if (result == null) result = caseNoProbabilityTechinique(quoteSampling);
				if (result == null) result = caseSamplingStrategy(quoteSampling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SamplingPackage.POPULATION_DESCRIPTION: {
				PopulationDescription populationDescription = (PopulationDescription)theEObject;
				T result = casePopulationDescription(populationDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingStrategy(SamplingStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probability Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probability Techinique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilityTechinique(ProbabilityTechinique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Random Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Random Techinique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRandomTechinique(SimpleRandomTechinique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systematic Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systematic Techinique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystematicTechinique(SystematicTechinique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stratified Random Sampling Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stratified Random Sampling Techinique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStratifiedRandomSamplingTechinique(StratifiedRandomSamplingTechinique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Probability Techinique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Probability Techinique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoProbabilityTechinique(NoProbabilityTechinique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convenience Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convenience Sampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvenienceSampling(ConvenienceSampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quote Sampling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quote Sampling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuoteSampling(QuoteSampling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulationDescription(PopulationDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SamplingSwitch
